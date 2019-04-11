package ph.cpi.rest.api.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.joda.time.DateTime;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.jasperreports.engine.JRException;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.request.ExportToCSVRequest;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.utils.PrintingUtility;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888"})
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
		reportParam.put("ADVICE_NO", grr.getAdviceNo());
		reportParam.put("HOLD_COV_ID", grr.getHoldCovId());
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
	
	@SuppressWarnings("unchecked")
	@PostMapping(path="exportToCSV")
	public ResponseEntity exportToCSV(@RequestBody ExportToCSVRequest etcr) throws SQLException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		logger.info("GET: /api/util-service/exportToCSV");
		logger.info("exportToCSVRequest : " + etcr.toString());
		String output = "";
		File file = new File("C:\\ETS\\REPORTS\\CSV\\" + etcr.getExtractTitle() +"_" + DateTime.now().toLocalDateTime().toString().replace(':', '.') + ".csv");
		try {

			
			
			String params = "";
			
			for (String key : etcr.getParams().keySet()) {
				params = params + key + "=" + etcr.getParams().get(key);
			}
			
			
			URL url = new URL("http://localhost:8888/api" + etcr.getMethodUrl() + 
					"?" + params);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");	
	

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			
			System.out.println("Output from Server .... \n");
			if ((output = br.readLine()) != null) {
				System.out.println("OUTPUT : " + output);
			}
			ObjectMapper mapper = new ObjectMapper();
		    
		    try{
		         Class<?> cls = Class.forName(etcr.getOutputClass());
		    	 Object outputClass = mapper.readValue(output, cls.newInstance().getClass());
		         System.out.println("outputClass : " + outputClass);
		         
		         
		         try (PrintWriter writer = new PrintWriter(file)) {
		        	 StringBuilder sb = new StringBuilder();
		        	  
		        	  for (String title : etcr.getColumnTitleList()) {
						sb.append(title);
						sb.append(",");
		        	  }
		        	  sb.append('\n');
		        	  
		        	  if ("/quote-service/retrieveQuoteListing".equalsIgnoreCase(etcr.getMethodUrl())) {
		        		  for (Quotation li : (ArrayList<Quotation>) outputClass.getClass().getMethod("getQuotationList").invoke(outputClass)) {
			        		  
			        		  for (String column : etcr.getColumnList()) {
			        			  try {
			        				java.lang.reflect.Method method;
			        				method = li.getClass().getMethod("get" + Character.toUpperCase(column.charAt(0)) + column.substring(1));
									sb.append(method.invoke(li));
									sb.append(',');
								} catch (NoSuchMethodException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (SecurityException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
			        		  }
			        		  
			        		  sb.append('\n');
			        	  }
		        	  } else if ("/quote-service/retrieveQuoteHoldCoverListing".equalsIgnoreCase(etcr.getMethodUrl())) {
		        		  for (Quotation li : (ArrayList<Quotation>) outputClass.getClass().getMethod("getQuotationList").invoke(outputClass)) {
			        		  
			        		  for (String column : etcr.getColumnList()) {
			        			  try {
			        				java.lang.reflect.Method method;
			        				method = li.getClass().getMethod("get" + Character.toUpperCase(column.charAt(0)) + column.substring(1));
									sb.append(method.invoke(li));
									sb.append(',');
								} catch (NoSuchMethodException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (SecurityException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
			        		  }
			        		  
			        		  sb.append('\n');
			        	  }
		        	  }
		        	  
		        	  
		        	  
		        	  
		        	  
		        	  
		        	  writer.write(sb.toString());
				      System.out.println("done!");

			    } catch (FileNotFoundException e) {
			      System.out.println(e.getMessage());
			    }
		    }
		    catch (JsonParseException e) { e.printStackTrace();}
		    catch (JsonMappingException e) { e.printStackTrace(); }
		    catch (IOException e) { e.printStackTrace(); } 
		    catch (ClassNotFoundException e1) { e1.printStackTrace(); }

		    conn.disconnect();

		  } catch (MalformedURLException e) {
			e.printStackTrace();
		  } catch (IOException e) {
			e.printStackTrace();
		  }
	    
		logger.info("FILE filename: " + file);
	    logger.info("FILE Absolute Path: " + file.getAbsolutePath());
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType("application/pdf"))
	            .body(resource);
	}
	
	
	
}