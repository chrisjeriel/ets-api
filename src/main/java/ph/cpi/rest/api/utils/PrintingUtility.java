package ph.cpi.rest.api.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

public class PrintingUtility {

	private static final Logger logger = LoggerFactory.getLogger(PrintingUtility.class);

	public String generateJasperReport(HashMap<String, Object> reportParams, String reportPath, String outputPath,
			String outputType) throws SQLException, JRException, IOException {

		logger.info("Generate Report: JASPER");

		HashMap<String, Object> mapRptParam = new HashMap<>();

		/*
		 * for (ReportParameter reportParameter : reportParams) {
		 * 
		 * mapRptParam.put(reportParameter.getParamName(),
		 * reportParameter.getParamValue());
		 * 
		 * }
		 */

		reportPath = "C:\\ETS\\REPORTS\\QUOTER009A_MAIN.jrxml";
		
		String filename = "QUOTER009A_" + "1_" + DateTime.now().toLocalDateTime().toString().replace(':', '.') + ".pdf";
		outputPath = "D:\\Projects\\PMMSC\\Reports\\Output\\" + filename;
		outputType = "pdf";
		mapRptParam.put("P_QUOTE_ID", 1);
		mapRptParam.put("pQuoteId", 1);
		

		JasperPrint jasperPrint = jasperPrint(reportPath, mapRptParam);
		
		File file = new File(outputPath);
		OutputStream out = new FileOutputStream(file);

		try {
			logger.info("Generating " + file.getName());
			
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
		

		return filename;
	}

	public JasperPrint jasperPrint(String reportPath, HashMap<String, Object> reportParameters)
			throws SQLException, JRException, IOException {

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.10.10.210:1521:ETSDEV", "CPI",
				"CPI12345!");

		try {

			JasperPrint print = null;
			/* conn = datasource.getConnection(); */
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
}
