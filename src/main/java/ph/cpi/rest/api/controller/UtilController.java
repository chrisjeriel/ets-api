package ph.cpi.rest.api.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.jasperreports.engine.JRException;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.utils.PrintingUtility;

@Controller
@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200"})
@RequestMapping(path="/util-service")
public class UtilController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(path="generateReport/{quoteId}")
	public ResponseEntity generateReport(@PathVariable("quoteId") Integer quoteId) throws SQLException, IOException {
		logger.info("GET: /api/util-service/generateReport");
		logger.info("generateReportRequest : ");
		
		HashMap dbParams = new HashMap<String, String>();
		dbParams.put("dbUrl", dbUrl);
		dbParams.put("username", username);
		dbParams.put("password", password);
		
		PrintingUtility pu = new PrintingUtility();
		HashMap reportParam = new HashMap<String, String>();
		reportParam.put("QUOTE_ID", quoteId);
		String filename = "";
		try {
			filename = pu.generateJasperReport(reportParam, dbParams, null, null, null);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		File file = new File(filename);
		logger.info("FILE filename: " + filename);
	    logger.info("FILE Absolute Path: " + file.getAbsolutePath());
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType("application/pdf"))
	            .body(resource);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(path="generateReport")
	public ResponseEntity generateReport(GenerateReportRequest grr) throws SQLException, IOException {
		logger.info("GET: /api/util-service/generateReport");
		logger.info("generateReportRequest : " + grr.toString());
		
		HashMap dbParams = new HashMap<String, String>();
		dbParams.put("dbUrl", dbUrl);
		dbParams.put("username", username);
		dbParams.put("password", password);
		
		PrintingUtility pu = new PrintingUtility();
		HashMap reportParam = new HashMap<String, String>();
		reportParam.put("QUOTE_ID", grr.getQuoteId());
		reportParam.put("REPORT_NAME", grr.getReportName());
		String filename = "";
		try {
			filename = pu.generateJasperReport(reportParam, dbParams, null, null, null);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		File file = new File(filename);
		logger.info("FILE filename: " + filename);
	    logger.info("FILE Absolute Path: " + file.getAbsolutePath());
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType("application/pdf"))
	            .body(resource);
	}
	
}