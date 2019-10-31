package ph.cpi.rest.api.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

	 void init();
	 
	 void store(MultipartFile file, String module, String refId);
	 
	 Stream<Path> loadAll();

	 Path load(String filename);

	 Resource loadAsResource(String filename, String module, String refId);

	 void deleteAll();

	 Integer delete(String fileNames, String module, String refId);
	
}
