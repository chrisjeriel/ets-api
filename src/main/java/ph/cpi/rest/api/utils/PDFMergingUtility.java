package ph.cpi.rest.api.utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.cos.COSStream;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.common.PDMetadata;
import org.apache.xmpbox.XMPMetadata;
import org.apache.xmpbox.schema.DublinCoreSchema;
import org.apache.xmpbox.schema.PDFAIdentificationSchema;
import org.apache.xmpbox.schema.XMPBasicSchema;
import org.apache.xmpbox.type.BadFieldValueException;
import org.apache.xmpbox.xml.XmpSerializer;

import ph.cpi.rest.api.merge.LazyFileInputStream;

public class PDFMergingUtility {
	private static final Log LOG = LogFactory.getLog(PDFMergingUtility.class);
	
	private FilenameFilter filenameFilter = new FilenameFilter() {
		 
		public boolean accept(File dir, String name) {
			return name.endsWith(".pdf");
		}
	};
	
	public void merge(String inputSourceDirectory, String outputFile,String mergedFileTitle, String creator, String subject,long maxMainMemoryBytes, long maxStorageBytes)
			throws IOException {
 
		long t1 = System.currentTimeMillis();
		List<InputStream> sources = prepareLazyInputStreamSources(inputSourceDirectory);
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		merge(sources,fileOutputStream,mergedFileTitle, creator,  subject, maxMainMemoryBytes,  maxStorageBytes);
 
		long t2 = System.currentTimeMillis();
		System.out.println("Total time taken in merging " + sources.size()
				+ " pdf files were " + (t2 - t1) + " milisecond.");
	}
 
	protected List<InputStream> prepareLazyInputStreamSources(
			String inputSourceDirectory) throws IOException {
 
		File dir = new File(inputSourceDirectory);
		if (!dir.exists() || !dir.isDirectory()) {
			throw new IOException(
					"Supplied path either does not exist or not a directory.");
		}
		List<LazyFileInputStream> sources = new ArrayList<LazyFileInputStream>();
		for (File file : dir.listFiles(filenameFilter)) {
			sources.add(new LazyFileInputStream(file.getAbsolutePath()));
		}
		return new ArrayList<InputStream>(sources);
	}
 
	/**
	 * Creates a compound PDF document from a list of input documents.
	 * <p>
	 * The merged document is PDF/A-1b compliant, provided the source documents
	 * are as well. It contains document properties title, creator and subject,
	 * currently hard-coded.
	 *
	 * @param sources
	 *            list of source PDF document streams.
	 * @return compound PDF document as a readable input stream.
	 * @throws IOException
	 *             if anything goes wrong during PDF merge.
	 */
	public void merge(final List<InputStream> sources,OutputStream outputStream,
			String mergedFileTitle, String creator, String subject, long maxMainMemoryBytes, long maxStorageBytes)
			throws IOException {
		String title = mergedFileTitle;
 
		COSStream cosStream = null;
		try {
			cosStream = new COSStream();
			PDFMergerUtility pdfMerger = createPDFMergerUtility(sources,
					outputStream);
			// PDF and XMP properties must be identical, otherwise document is
			// not PDF/A compliant
			PDDocumentInformation pdfDocumentInfo = createPDFDocumentInfo(
					title, creator, subject);
			PDMetadata xmpMetadata = createXMPMetadata(cosStream, title,
					creator, subject);
			pdfMerger.setDestinationDocumentInformation(pdfDocumentInfo);
			pdfMerger.setDestinationMetadata(xmpMetadata);
 
			LOG.info("Merging " + sources.size()
					+ " source documents into one PDF");
			pdfMerger.mergeDocuments(MemoryUsageSetting.setupMixed(maxMainMemoryBytes, maxStorageBytes));
			LOG.info("PDF merge successful");
			 
		} catch (BadFieldValueException e) {
			throw new IOException("Problem while merging PDFs", e);
		} catch (TransformerException e) {
			throw new IOException("Problem while merging PDFs", e);
		} finally {
			for (InputStream source : sources) {
				IOUtils.closeQuietly(source);
			}
			IOUtils.closeQuietly(cosStream);
			IOUtils.closeQuietly(outputStream);
		}
	}
 
	private PDFMergerUtility createPDFMergerUtility(List<InputStream> sources,
			OutputStream mergedPDFOutputStream) {
		LOG.info("Initialising PDF merge utility");
		PDFMergerUtility pdfMerger = new PDFMergerUtility();
		pdfMerger.addSources(sources);
		pdfMerger.setDestinationStream(mergedPDFOutputStream);
		return pdfMerger;
	}
 
	private PDDocumentInformation createPDFDocumentInfo(String title,
			String creator, String subject) {
		LOG.info("Setting document info (title, author, subject) for merged PDF");
		PDDocumentInformation documentInformation = new PDDocumentInformation();
		documentInformation.setTitle(title);
		documentInformation.setCreator(creator);
		documentInformation.setSubject(subject);
		return documentInformation;
	}
 
	private PDMetadata createXMPMetadata(COSStream cosStream, String title,
			String creator, String subject) throws BadFieldValueException,
			TransformerException, IOException {
		LOG.info("Setting XMP metadata (title, author, subject) for merged PDF");
		XMPMetadata xmpMetadata = XMPMetadata.createXMPMetadata();
 
		// PDF/A-1b properties
		PDFAIdentificationSchema pdfaSchema = xmpMetadata
				.createAndAddPFAIdentificationSchema();
		pdfaSchema.setPart(1);
		pdfaSchema.setConformance("B");
 
		// Dublin Core properties
		DublinCoreSchema dublinCoreSchema = xmpMetadata
				.createAndAddDublinCoreSchema();
		dublinCoreSchema.setTitle(title);
		dublinCoreSchema.addCreator(creator);
		dublinCoreSchema.setDescription(subject);
 
		// XMP Basic properties
		XMPBasicSchema basicSchema = xmpMetadata.createAndAddXMPBasicSchema();
		Calendar creationDate = Calendar.getInstance();
		basicSchema.setCreateDate(creationDate);
		basicSchema.setModifyDate(creationDate);
		basicSchema.setMetadataDate(creationDate);
		basicSchema.setCreatorTool(creator);
 
		// Create and return XMP data structure in XML format
		ByteArrayOutputStream xmpOutputStream = null;
		OutputStream cosXMPStream = null;
		try {
			xmpOutputStream = new ByteArrayOutputStream();
			cosXMPStream = cosStream.createOutputStream();
			new XmpSerializer().serialize(xmpMetadata, xmpOutputStream, true);
			cosXMPStream.write(xmpOutputStream.toByteArray());
			return new PDMetadata(cosStream);
		} finally {
			IOUtils.closeQuietly(xmpOutputStream);
			IOUtils.closeQuietly(cosXMPStream);
		}
	}

}
