package ph.cpi.rest.api.utils;

import java.awt.image.BufferedImage;
import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.print.PrintException;
import javax.print.PrintService;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.printing.Orientation;
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.printing.PDFPrintable;
import org.apache.pdfbox.printing.Scaling;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

public class PrintingUtility {
	
	
	private static final Logger logger = LoggerFactory.getLogger(PrintingUtility.class);
	
	
	public String generateJasperReport(HashMap<String, Object> reportParams, HashMap<String, Object> dbParams, String reportPath, String outputPath,
			String outputType) throws SQLException, JRException, IOException {

		logger.info("Generate Jasper Report:");
		Connection conn = DriverManager.getConnection(dbParams.get("dbUrl").toString(), 
												      dbParams.get("username").toString(), 
												      dbParams.get("password").toString());

		
		String reportName = reportParams.get("REPORT_NAME").toString();
		String path = reportParams.get("REPORT_PATH").toString();
		
		reportPath = path + reportName ;//+ "_MAIN.jrxml";
		
		String filename = reportName + "_" + DateTime.now().toLocalDateTime().toString().replace(':', '.') + ".pdf";
		
		if (outputPath == null){
		    outputPath = path+"Output\\" + filename;
		} else {
			outputPath = outputPath + filename;
		}
		
		outputType = "pdf";
		
		reportParams.put("SUBREPORT_DIR", path);
		
		
		logger.info("generateJasperReport outputPath : " + outputPath);
		JasperPrint jasperPrint = jasperPrint(conn, reportPath, reportParams);
		
		File file = new File(outputPath);
		OutputStream out = new FileOutputStream(file);
		
		try {
			logger.info("Generating " + file.getName());
			System.out.println(jasperPrint);
			System.out.println(out);
			if ("pdf".equalsIgnoreCase(outputType)) {
				JasperExportManager.exportReportToPdfStream(jasperPrint, out);
			} else if ("jpeg".equalsIgnoreCase(outputType) || "jpg".equalsIgnoreCase(outputType)) {

				if (jasperPrint.getPages().size() > 0) {
					BufferedImage image = (BufferedImage) JasperPrintManager.printPageToImage(jasperPrint, jasperPrint.getPages().size() - 1, 1f);
					ImageIO.write(image, outputType, out);

				} else
					logger.info("No image output.");
			}
		} finally {
			logger.info("Generating " + file.getName() + " done!");
			out.close();
		}
		logger.info(path);
		logger.info(filename);
		logger.info(file.getAbsolutePath());
		conn.close();
		return file.getAbsolutePath();
	}

	@Autowired
	public JasperPrint jasperPrint(Connection conn, String reportPath, HashMap<String, Object> reportParameters)
			throws SQLException, JRException, IOException {
		
		try {

			JasperPrint print = null;
			File reportFile = new File(reportPath);

			if (!reportFile.exists()) {
				logger.error(reportFile.getPath() + " doesnt exists!");

			} else {
				logger.info(reportFile.getPath() + " exists!");
				JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
				print = JasperFillManager.fillReport(jasperReport, reportParameters, conn);
			}
			return print;

		} finally {
			conn.close();
		}

	}
	
	public String directPrint(String absolutePath, PrintService printer, String paperSize, String pageOrientation) throws PrintException, IOException, PrinterException{
		logger.info("ABsolUte PaTh : " + absolutePath);
		logger.info(printer.getName());
		String result = "";
		PDDocument document = PDDocument.load(new File(absolutePath));
		PDPage page = null;
		paperSize = paperSize == null ? "" : paperSize;
		pageOrientation = pageOrientation == null ? "" : pageOrientation;
	    switch(paperSize.toUpperCase()){
	    	case "A0":
	    		page = new PDPage(PDRectangle.A0);
	    		break;
	    	case "A1":
	    		page = new PDPage(PDRectangle.A1);
	    		break;
	    	case "A2":
	    		page = new PDPage(PDRectangle.A2);
	    		break;
	    	case "A3":
	    		page = new PDPage(PDRectangle.A3);
	    		break;
	    	case "A4":
	    		page = new PDPage(PDRectangle.A4);
	    		break;
	    	case "A5":
	    		page = new PDPage(PDRectangle.A5);
	    		break;
	    	case "A6":
	    		page = new PDPage(PDRectangle.A6);
	    		break;
	    	case "LETTER":
	    		page = new PDPage(PDRectangle.LETTER);
	    		break;
	    	case "LEGAL":
	    		page = new PDPage(PDRectangle.LEGAL);
	    		break;
	    	default:
	    		page = new PDPage(PDRectangle.LETTER);
	    }
	    logger.info("Page Orientation => " + pageOrientation);
	    logger.info("Paper size => " + paperSize);
	    PDRectangle mediaBox = page.getMediaBox();
	    page = document.getPage(0);
	    if("HALFLETTER".equals(paperSize.toUpperCase())){
		    logger.info("x " + mediaBox.getLowerLeftX());
		    logger.info("y " + mediaBox.getLowerLeftY());
		    logger.info("width " + mediaBox.getWidth());
		    logger.info("height " + mediaBox.getHeight());
		    page.setMediaBox(new PDRectangle(mediaBox.getLowerLeftX(),mediaBox.getLowerLeftY()-200,mediaBox.getWidth(),mediaBox.getHeight()));
	    }
	    document.removePage(0);
	    document.addPage(page);
	    PDFPrintable printable = new PDFPrintable(document, Scaling.SCALE_TO_FIT);
		try{
			PrinterJob job = PrinterJob.getPrinterJob();
		    job.setPrintable(printable);
		    switch(pageOrientation.toUpperCase()){
		    	case "LANDSCAPE":
		    		job.setPageable(new PDFPageable(document, Orientation.LANDSCAPE));
		    	break;
		    	case "PORTRAIT":
		    		job.setPageable(new PDFPageable(document, Orientation.PORTRAIT));
		    	break;
		    	default:
		    		job.setPageable(new PDFPageable(document, Orientation.AUTO));
		    }
		    job.setPrintService(printer);
		    job.print();
		    result = "success";
		    logger.info("print job success");
		}catch(PrinterException e){
			e.printStackTrace();
			if(e instanceof PrinterAbortException){
				result = "Print was aborted";
				throw new PrinterAbortException();
			}else{
				result = "Failed";
				throw new PrinterException();
			}
			
		}finally{
			document.close();  
		}
		return result;
	}
	
}
	
	


	
	

