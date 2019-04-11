package ph.cpi.rest.api.controller;
import java.io.IOException;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import ph.cpi.rest.api.service.StorageService;
import ph.cpi.rest.api.storage.StorageFileNotFoundException;

@Controller
@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", "http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888"})
@RequestMapping(path="/file-upload-service")
public class FileUploadController {
	
	 private final StorageService storageService;
	 private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	 
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
	    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		 logger.info("GET: /api/file-upload-service/files/");
		 
	        Resource file = storageService.loadAsResource(filename);
	        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
	                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	    }
	 
	 
	 @PostMapping("/")
	    public @ResponseBody String handleFileUpload(@RequestParam("file") MultipartFile file,
	            RedirectAttributes redirectAttributes) {
		 
		 logger.info("POST: /api/file-upload-service/files/");
	     
		 storageService.store(file);
	     redirectAttributes.addFlashAttribute("message",
	                "You successfully uploaded " + file.getOriginalFilename() + "!");
	     logger.info("You successfully uploaded " + file.getOriginalFilename() + "!");
	     return "redirect:/";
	    }
	 
	 @ExceptionHandler(StorageFileNotFoundException.class)
	    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		    logger.info("Error uploading files");
	        return ResponseEntity.notFound().build();
	    }
	
	
	
	
	
	
	

}
