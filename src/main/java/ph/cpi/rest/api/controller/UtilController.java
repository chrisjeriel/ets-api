package ph.cpi.rest.api.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.jasperreports.engine.JRException;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyResponse;
import ph.cpi.rest.api.service.QuoteService;
import ph.cpi.rest.api.utils.PrintingUtility;

@Controller
@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200"})
@RequestMapping(path="/util-service")
public class UtilController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@GetMapping(path="generateReport")
	public ResponseEntity generateReport() throws SQLException, IOException {
		logger.info("GET: /api/util-service/generateReport");
		logger.info("generateReportRequest : ");
		
		
		PrintingUtility pu = new PrintingUtility();
		try {
			pu.generateJasperReport(null, null, null, null);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String filepath = "D:/Projects/PMMSC/Reports/Output/File.pdf";
		File file = new File("D:/Projects/PMMSC/Reports/Output/File.pdf");
	    
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType("application/pdf"))
	            .body(resource);
		
	}
	
}