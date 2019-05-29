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
		HashMap<String, Object> mapRptParam = new HashMap<>();

		reportPath = "C:\\ETS\\REPORTS\\" + reportName + "_MAIN.jrxml";
		
		String filename = reportName + "_" + reportParams.get("QUOTE_ID") + "_" + DateTime.now().toLocalDateTime().toString().replace(':', '.') + ".pdf";
		
		if (outputPath == null){
		    outputPath = "C:\\ETS\\REPORTS\\Output\\" + filename;
		} else {
			outputPath = outputPath + filename;
		}

		outputType = "pdf";
		mapRptParam.put("P_QUOTE_ID", reportParams.get("QUOTE_ID"));
		mapRptParam.put("pQuoteId", reportParams.get("QUOTE_ID"));
		
		mapRptParam.put("P_ADVICE_NO", reportParams.get("ADVICE_NO"));
		mapRptParam.put("pAdviceNo", reportParams.get("ADVICE_NO"));
		
		mapRptParam.put("P_HOLD_COV_ID", reportParams.get("HOLD_COV_ID"));
		mapRptParam.put("pHoldCovId", reportParams.get("HOLD_COV_ID"));
		
		mapRptParam.put("P_USER_ID", reportParams.get("USER_ID"));
		mapRptParam.put("pUserId", reportParams.get("USER_ID"));
		
		logger.info("generateJasperReport outputPath : " + outputPath);
		JasperPrint jasperPrint = jasperPrint(conn, reportPath, mapRptParam);
		
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
	
}
	
	


	
	

