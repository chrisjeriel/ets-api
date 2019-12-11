package ph.cpi.rest.api;

import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class ClassTester {

	public static void main(String[] args) throws Exception {
		/*// TODO Auto-generated method stub
		PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
		DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
		PrintService[] printServices = PrintServiceLookup.lookupPrintServices(flavor, set);
		//ArrayList<String> printerNames = new ArrayList<String>();
		PrintService selected = null;
		for(PrintService printer : printServices){
			System.out.println(printer.getName());
			if ("\\\\192.10.10.237\\HP LaserJet MFP M129-M134".equalsIgnoreCase(printer.getName())) {
				System.out.println(printer.getName());
				System.out.println("PRINTER FOUND");
				selected = printer;
			}
			
		}
		
		//FileInputStream fis = new FileInputStream("C:\\test.txt");
		PDDocument document = PDDocument.load(new File("C:\\ETS\\REPORTS\\Output\\ACSER_OR_NVAT.jrxml_2019-12-10T16.58.17.475"));
		try{
			
		    //Doc pdfDoc = new SimpleDoc(fis, flavor, null);
			PrinterJob job = PrinterJob.getPrinterJob();
		    job.setPageable(new PDFPageable(document));
		    job.setPrintService(selected);
		    job.print();
		    result = "success";
		    logger.info("print job success");
		    System.out.println("Done printing");
		}finally{
		   document.close(); 
		}*/
	
		
	}

}
