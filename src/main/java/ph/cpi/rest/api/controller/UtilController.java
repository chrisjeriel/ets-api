package ph.cpi.rest.api.controller;


import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.jasperreports.engine.JRException;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.request.ExportToCSVRequest;
import ph.cpi.rest.api.model.request.GenerateReportMergeRequest;
import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.request.RetrieveAcitPaytReqRequest;
import ph.cpi.rest.api.model.request.RetrieveExtractToCsvRequest;
import ph.cpi.rest.api.model.request.RetrieveExtractToCsvResponse;
import ph.cpi.rest.api.model.response.ExtractReportResponse;
import ph.cpi.rest.api.model.response.RetrieveAcitPaytReqResponse;
import ph.cpi.rest.api.service.UtilService;
import ph.cpi.rest.api.utils.PDFMergingUtility;
import ph.cpi.rest.api.utils.PrintingUtility;
import ph.cpi.rest.api.utils.ReportParameters;

@Controller
@CrossOrigin(origins = {"http://localhost:4200", "http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.202:4201", 
						"http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", 
						"http://192.10.10.230:8888", "http://192.10.10.149:4200", "http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200",
						"http://192.10.10.210:8889", "http://192.10.10.210:4201","http://192.168.1.4:4200"})
@RequestMapping(path="/util-service")
public class UtilController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	
	@Autowired 
	private UtilService utilService;
	
	@PostMapping(path="extractReport")
	public @ResponseBody ExtractReportResponse extractReport(@RequestBody GenerateReportRequest request) throws SQLException {
		logger.info("POST: /api/util-service/extractReport");
		logger.info("extractReport : " + request.toString());
		return utilService.extractReport(request);
	}
	
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
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	@PostMapping(path="mergePDF")
	public ResponseEntity mergePDF(@RequestBody GenerateReportMergeRequest grmr ) throws SQLException, IOException {
		logger.info("GET: /api/util-service/mergePDF");
		PDFMergingUtility pdfMergingUtility = new PDFMergingUtility();
	    String FOLDER ="C:\\ETS\\REPORTS\\Output\\" + DateTime.now().toLocalDateTime().toString().replace(':', '_') ;
	    
	    File newFolder = new File(FOLDER);
	    boolean created =  newFolder.mkdirs();
	   
	    logger.info("generateFolder :");
	    if(created) {
	    	
	    	HashMap dbParams = new HashMap<String, String>();
			dbParams.put("dbUrl", dbUrl);
			dbParams.put("username", username);
			dbParams.put("password", password);
			
			PrintingUtility pu = new PrintingUtility();
			HashMap reportParam = new HashMap<String, String>();
			
			String fileName = "";
			String 	outputPath = FOLDER + "\\";
			
			for(int i=0; i<grmr.getReportRequest().size(); i++){
	
				reportParam.put("P_QUOTE_ID", grmr.getReportRequest().get(i).getQuoteId());
				reportParam.put("pQuoteId", grmr.getReportRequest().get(i).getQuoteId());
				
				reportParam.put("P_ADVICE_NO", grmr.getReportRequest().get(i).getAdviceNo());
				reportParam.put("pAdviceNo", grmr.getReportRequest().get(i).getAdviceNo());
				
				reportParam.put("P_HOLD_COV_ID", grmr.getReportRequest().get(i).getHoldCovId());
				reportParam.put("pHoldCovId", grmr.getReportRequest().get(i).getHoldCovId());
				
				reportParam.put("P_USER_ID", grmr.getReportRequest().get(i).getUserId());
				reportParam.put("pUserId", grmr.getReportRequest().get(i).getUserId());
				reportParam.put("P_PRINTED_BY", grmr.getReportRequest().get(i).getUserId());
				reportParam.put("p_printed_by", grmr.getReportRequest().get(i).getUserId());
				
				reportParam.put("P_TRAN_ID", grmr.getReportRequest().get(i).getTranId());
				reportParam.put("pTranId", grmr.getReportRequest().get(i).getTranId());
				
				reportParam.put("P_REQ_ID", grmr.getReportRequest().get(i).getReqId());
				reportParam.put("pReqId", grmr.getReportRequest().get(i).getReqId());
				
				
				reportParam.put("P_REPORT_ID", grmr.getReportRequest().get(i).getReportId());
				reportParam.put("p_report_id", grmr.getReportRequest().get(i).getReportId());
				reportParam.put("pReportId", grmr.getReportRequest().get(i).getReportId());
				
				reportParam.put("reportId", grmr.getReportRequest().get(i).getReportName());
				reportParam.put("P_CEDING_ID", grmr.getReportRequest().get(i).getCedingId());
				reportParam.put("p_ceding_id", grmr.getReportRequest().get(i).getCedingId());
				reportParam.put("pCedingId", grmr.getReportRequest().get(i).getCedingId());
				
				reportParam.put("P_POLICY_ID", grmr.getReportRequest().get(i).getPolicyId());
				reportParam.put("p_policy_id", grmr.getReportRequest().get(i).getPolicyId());
				
				reportParam.put("P_INVOICE_ID", grmr.getReportRequest().get(i).getInvoiceId());


				reportParam.put("REPORT_NAME", utilService.getReportFileName(reportParam));
				reportParam.put("REPORT_PATH", utilService.getReportPath());
				
				
				System.out.println("GENERATED REPORT PARAMS:");
				System.out.println(reportParam);
				
				try {
					fileName = pu.generateJasperReport(reportParam, dbParams, null, outputPath, null);
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e){  
                    System.out.println(e.getMessage());  
                }
	       }
			    try {
			    	 pdfMergingUtility.merge(FOLDER,
							FOLDER + "//BatchPrint.pdf", 
							"", 
							"", 
							"", 0, 1000000000000l);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	    }  
        else {
            System.out.println("Error on merging PDF files unable to create temp directory");
        }
	    
	    File file = new File(FOLDER + "//BatchPrint.pdf");
	    logger.info("FILE filename: " + file);
	    Path path = Paths.get(file.getAbsolutePath());
	    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
	    
	    if (resource == null){
	    	return null;
	    }else {
	        return ResponseEntity.ok()
	 	            .contentType(MediaType.parseMediaType("application/pdf"))
	 	            .body(resource);
	    }
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
		
		String filename = "";
		try {
			PrintingUtility pu = new PrintingUtility();
			HashMap reportParam = new HashMap<String, String>();
			if (grr.getReportId() != null && (grr.getReportId().toUpperCase().contains("POLR044") || grr.getReportId().toUpperCase().contains("POLR052"))) {
				System.out.println("POLR044");
				reportParam = ReportParameters.mapPOLR044AParams(grr.getPolr044Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR061")) {
				System.out.println("ACITR061");
				reportParam = ReportParameters.mapACITR061Params(grr.getAcitr061Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("CLMR010")) {
				System.out.println("CLMR010");
				reportParam = ReportParameters.mapCLMR010Params(grr.getClmr010Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR052")) {
				System.out.println("ACITR052");
				reportParam = ReportParameters.mapACITR052Params(grr.getAcitr052Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACSER060")) {
				System.out.println("ACSER060");
				reportParam = ReportParameters.mapACSER060Params(grr.getAcser060Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR066")) {
				System.out.println("ACITR066");
				reportParam = ReportParameters.mapACITR066Params(grr.getAcitr066Params());
			} else {
				reportParam = ReportParameters.mapReportParams(grr);
			}
			
			
			reportParam.put("REPORT_NAME", utilService.getReportFileName(reportParam));
			reportParam.put("REPORT_PATH", utilService.getReportPath());
			
			System.out.println("GENERATED REPORT PARAMS:");
			System.out.println(reportParam);
			
			
			filename = pu.generateJasperReport(reportParam, dbParams, null, null, null);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
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
	
	@GetMapping(path="retrievePrinters")
	public @ResponseBody ArrayList<String> retrievePrinters() throws SQLException {
		PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
		ArrayList<String> printerNames = new ArrayList<String>();
		for(PrintService printer : printServices){
			logger.info(printer.getName());
			printerNames.add(printer.getName());
		}
		return printerNames;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(path="directPrint")
	public @ResponseBody Response directPrint(GenerateReportRequest grr) throws SQLException, IOException, PrintException, PrinterException, ParseException {
		logger.info("GET: /api/util-service/directPrint");
		logger.info("generateReportRequest : " + grr.toString());
		Response response = new Response();
		PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
		PrintService chosenPrinter = null;
		String result = "";
		HashMap dbParams = new HashMap<String, String>();
		dbParams.put("dbUrl", dbUrl);
		dbParams.put("username", username);
		dbParams.put("password", password);
		
		String filename = "";
		try {
			PrintingUtility pu = new PrintingUtility();
			HashMap reportParam = new HashMap<String, String>();
			if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("POLR044")) {
				System.out.println("POLR044");
				reportParam = ReportParameters.mapPOLR044AParams(grr.getPolr044Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR061")) {
				System.out.println("ACITR061");
				reportParam = ReportParameters.mapACITR061Params(grr.getAcitr061Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("CLMR010")) {
				System.out.println("CLMR010");
				reportParam = ReportParameters.mapCLMR010Params(grr.getClmr010Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACITR052")) {
				System.out.println("ACITR052");
				reportParam = ReportParameters.mapACITR052Params(grr.getAcitr052Params());
			} else if (grr.getReportId() != null &&  grr.getReportId().toUpperCase().contains("ACSER060")) {
				System.out.println("ACSER060");
				reportParam = ReportParameters.mapACSER060Params(grr.getAcser060Params());
			} else {
				reportParam = ReportParameters.mapReportParams(grr);
			}
			
			
			reportParam.put("REPORT_NAME", utilService.getReportFileName(reportParam));
			reportParam.put("REPORT_PATH", utilService.getReportPath());
			
			System.out.println("GENERATED REPORT PARAMS:");
			System.out.println(reportParam);
			
			for(PrintService printer : printServices){
				logger.info(printer.getName());
				if(printer.getName().equals(grr.getPrinterName())){
					chosenPrinter = printer;
					logger.info("CHOSEN : " + chosenPrinter.toString());
					break;
				}
			}
			if(chosenPrinter == null){
				result = "Printer not found.";
				response.getErrorList().add(new Error("Error", result));
				return response;
			}
			
			filename = pu.generateJasperReport(reportParam, dbParams, null, null, null);
			result = pu.directPrint(filename, chosenPrinter, grr.getPaperSize(), grr.getPageOrientation());
			response.getMessageList().add(new Message("Message", result));
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrintException e) {
			result = "Failed";
			response.getErrorList().add(new Error("Error", result));
			e.printStackTrace();
		} catch (PrinterException e) {
			if(e instanceof PrinterAbortException){
				result = "Print was aborted";
			}else{
				result = "Failed";
			}
			response.getErrorList().add(new Error("Error", result));
			e.printStackTrace();
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		File file = new File(filename);
		logger.info("FILE filename: " + filename);
	    logger.info("FILE Absolute Path: " + file.getAbsolutePath());
	    Path path = Paths.get(file.getAbsolutePath());
	    new ByteArrayResource(Files.readAllBytes(path));
		return response;
	}
	
	@GetMapping(path="retrieveExtractToCsv")
	public @ResponseBody RetrieveExtractToCsvResponse retrieveExtractToCsv(RetrieveExtractToCsvRequest raprr) throws SQLException {
		logger.info("GET: /api/util-service/retrieveExtractToCsv");
		logger.info("RetrieveExtractToCsvRequest : " + raprr.toString());
		return utilService.retrieveExtractToCsv(raprr);
	}
}