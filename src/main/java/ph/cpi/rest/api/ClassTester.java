package ph.cpi.rest.api;

import java.io.FileInputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class ClassTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		/*
		 * System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		 * 
		 * System.out.println(ETSEncoder.doEncrypt("cpi12345!"));
		 * System.out.println("------------------------------");
		 * 
		 * System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
		 * System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
		 */
		
		/*
		 * PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null,
		 * null); ArrayList<String> printerNames = new ArrayList<String>(); PrintService
		 * selected = null; for(PrintService printer : printServices){ if
		 * ("HP LaserJet MFP M129-M134".equalsIgnoreCase(printer.getName())) {
		 * System.out.println(printer.getName()); System.out.println("PRINTER FOUND");
		 * selected = printer; }
		 * 
		 * }
		 * 
		 * // \\\\192.10.10.237\\HP LaserJet MFP M129-M134 PrintRequestAttributeSet pras
		 * = new HashPrintRequestAttributeSet(); FileInputStream fis = new
		 * FileInputStream("C:\\test.txt"); DocAttributeSet das = new
		 * HashDocAttributeSet(); Doc pdfDoc = new SimpleDoc(fis,
		 * DocFlavor.INPUT_STREAM.AUTOSENSE, das); DocPrintJob printJob =
		 * selected.createPrintJob(); try{ printJob.print(pdfDoc, pras);
		 * System.out.println("Done printing"); }catch(PrintException e){
		 * e.printStackTrace(); //result = e.getCause().toString().substring(32,
		 * e.getCause().toString().indexOf("\n")); }finally{ fis.close(); }
		 */
		
		
		/*DocFlavor df=DocFlavor.URL.JPEG;
		AttributeSet attribute=new HashAttributeSet();
		attribute.add(OrientationRequested.LANDSCAPE);
		attribute.add(ColorSupported.SUPPORTED);
		PrintService[] services=PrintServiceLookup
		   .lookupPrintServices(df, attribute);
		for (int i=0;i<services.length;i++){
		   if(services[i].isDocFlavorSupported(df))
		      System.out.println(services[i].getName());
		}
		
		PrintService ps0=PrintServiceLookup.lookupDefaultPrintService();
		DocFlavor f[]=ps0.getSupportedDocFlavors();
		for(int i=0;i<f.length;i++){
		   System.out.println("MIME Type:"+f[i].getMimeType());
		   System.out.println("Media Subtype:"+f[i].getMediaSubtype());
		   System.out.println("Media Type:"+f[i].getMediaType());
		   System.out.println("--------------------------------------");
		}*/
		
		/*
		 * PrintService ps=PrintServiceLookup.lookupDefaultPrintService(); DocPrintJob
		 * job=ps.createPrintJob(); job.addPrintJobListener(new PrintJobAdapter() {
		 * public void printDataTransferCompleted(PrintJobEvent event){
		 * System.out.println("data transfer complete"); } public void
		 * printJobNoMoreEvents(PrintJobEvent event){
		 * System.out.println("received no more events"); } }); FileInputStream fis=new
		 * FileInputStream("C:/2.jpg"); Doc doc=new SimpleDoc(fis,
		 * DocFlavor.INPUT_STREAM.JPEG, null); // Doc doc=new SimpleDoc(fis,
		 * DocFlavor.INPUT_STREAM.JPEG, null); PrintRequestAttributeSet attrib=new
		 * HashPrintRequestAttributeSet(); attrib.add(new Copies(1)); job.print(doc,
		 * attrib);
		 * WORKING WAY*/ 
		
		/*
		 * PrintService[] printServices =
		 * PrintServiceLookup.lookupPrintServices(null,null); ArrayList<String>
		 * printerNames = new ArrayList<String>(); PrintService selected = null;
		 * for(PrintService printer : printServices){
		 * if("HP LaserJet MFP M129-M134".equalsIgnoreCase(printer.getName())) {
		 * System.out.println(printer.getName()); System.out.println("PRINTER FOUND");
		 * selected = printer; } }
		 * 
		 * DocFlavor docflavor = new DocFlavor.INPUT_STREAM
		 * ("application/octet-stream");
		 * 
		 * FileInputStream fis = new FileInputStream("C://test.pdf"); Doc pdfDoc = new
		 * SimpleDoc(fis, docflavor, null); DocPrintJob printJob =
		 * selected.createPrintJob(); printJob.print(pdfDoc, new
		 * HashPrintRequestAttributeSet()); fis.close();
		 */
		

		PrintService ps=PrintServiceLookup.lookupDefaultPrintService(); 
		DocPrintJob job=ps.createPrintJob(); 
		job.addPrintJobListener(new PrintJobAdapter() {
			public void printDataTransferCompleted(PrintJobEvent event) {
		System.out.println("data transfer complete"); } public void
		printJobNoMoreEvents(PrintJobEvent event){
		System.out.println("received no more events"); } }); 
		FileInputStream fis = new FileInputStream("C:/2.jpg"); 
		Doc doc=new SimpleDoc(fis, DocFlavor.INPUT_STREAM.JPEG, null); 
//		Doc doc=new SimpleDoc(fis, DocFlavor.INPUT_STREAM.JPEG, null); 
		PrintRequestAttributeSet attrib=new HashPrintRequestAttributeSet(); 
		attrib.add(new Copies(1)); job.print(doc,
		attrib);
		
	}

}
