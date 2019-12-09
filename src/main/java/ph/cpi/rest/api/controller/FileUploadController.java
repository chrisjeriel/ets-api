package ph.cpi.rest.api.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.response.UploadFileToDBResponse;
import ph.cpi.rest.api.service.StorageService;
import ph.cpi.rest.api.service.UtilService;
import ph.cpi.rest.api.service.impl.UtilServiceImpl;
import ph.cpi.rest.api.storage.StorageFileNotFoundException;

@Controller
@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", 
						"http://192.168.99.202:8080", "http://192.10.10.210:4200", "http://192.10.10.210:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200",
						"http://192.10.10.210:8889", "http://192.10.10.210:4201"})
@RequestMapping(path="/file-upload-service")
public class FileUploadController {
	
	 private final StorageService storageService;
	 private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	 
	 @Autowired 
		private UtilService utilService;
	 
	 @Autowired
	    public FileUploadController(StorageService storageService) {
	        this.storageService = storageService;
	    }
	
	 @GetMapping("/")
	    public String listUploadedFiles(Model model) throws IOException {
	        model.addAttribute("files", storageService.loadAll().map(
	                path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class,
	                        "serveFile", path.getFileName().toString()).build().toString())
	                .collect(Collectors.toList()));

	        return "uploadForm";
	    }
	 
	 @GetMapping("/files/{filename:.+}")
	    @ResponseBody
	    public ResponseEntity<Resource> serveFile(@PathVariable String filename, String module, String refId) {

		 logger.info("GET: /api/file-upload-service/files/");
		 
	        Resource file = storageService.loadAsResource(filename, module, refId);
	        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
	                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	    }
	 
	 
	 @PostMapping("/")
	    public @ResponseBody String handleFileUpload(@RequestParam("file") MultipartFile file,
	            RedirectAttributes redirectAttributes, String module, String refId) {
		 
		 logger.info("POST: /api/file-upload-service/files/");
	     String response = "";
		 response = storageService.store(file, module, refId);
	     redirectAttributes.addFlashAttribute("message",
	                "You successfully uploaded " + file.getOriginalFilename() + "!");
	     logger.info("You successfully uploaded " + file.getOriginalFilename() + "!");
	     return response;
	    }
	 
	 @DeleteMapping("/")
	    public @ResponseBody String deleteFile(@RequestParam String fileNames, String module, String refId) {
		 
		 logger.info("POST: /api/file-upload-service/files/");
	     
		 Integer errorCode = storageService.delete(fileNames, module, refId);
	     logger.info("You successfully deleted " + fileNames + "!");
	     return errorCode.toString();
	    }
	 
	 @ExceptionHandler(StorageFileNotFoundException.class)
	    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		    logger.info("Error uploading files");
	        return ResponseEntity.notFound().build();
	    }
	 
//	 aeru.setAcctType("");
//		aeru.setTranClass("");
//		aeru.setTranId("");
//		aeru.setProcBy("");
	
	
	 @PostMapping("/uploadFileToDB")
	    public @ResponseBody UploadFileToDBResponse handleFileUploadToDB(@RequestParam("file") MultipartFile file,
	            RedirectAttributes redirectAttributes, String table, String acctType, String tranClass, String tranId, String procBy) throws SQLException, IOException, UncategorizedSQLException {
		 
		 logger.info("POST: /api/file-upload-service/uploadFileToDB/");
		 UploadFileToDBResponse response = new UploadFileToDBResponse();
		 Response acctEntResponse = new Response();
	     String refFolder = table + "//" + procBy + "//" + acctType + "//" + tranClass;
		 response.getMessageList().add(new Message("Message", storageService.store(file, refFolder, tranId))) ;
		 
	     redirectAttributes.addFlashAttribute("message",
	                "You successfully uploaded " + file.getOriginalFilename() + "!");
	     logger.info("You successfully uploaded " + file.getOriginalFilename() + "!");
	     logger.info("Now uploading to "+ refFolder);
	     Resource upFile = storageService.loadAsResource(file.getOriginalFilename(), refFolder, tranId);
	     System.out.println(upFile);
	     System.out.println(upFile.getFilename());
	     try {
			System.out.println(upFile.getURI().toString());
			System.out.println(upFile.getURL());
			
			acctEntResponse = utilService.uploadDataTable(upFile.getURL().toString().replace("file:/", ""), acctType, tranClass, tranId, procBy);
			if(acctEntResponse.getErrorList().size() != 0){
				response.getErrorList().add(new Error("SQLException",acctEntResponse.getErrorList().get(0).getErrorMessage()));
			}
			
		} catch (IOException | SQLException | UncategorizedSQLException e) {
			// TODO Auto-generated catch block
			logger.info("logger");
			//e.printStackTrace();
			System.out.println(e.getCause().toString());
			response.getErrorList().add(new Error("General Error",e.getMessage()));
			logger.info(e.getCause().toString());
			logger.info("logger");
			
		}
	     
	     return response;
	    }
}
