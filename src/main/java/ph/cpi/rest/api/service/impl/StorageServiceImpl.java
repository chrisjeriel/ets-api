package ph.cpi.rest.api.service.impl;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import ph.cpi.rest.api.service.StorageService;
import ph.cpi.rest.api.storage.StorageException;
import ph.cpi.rest.api.storage.StorageFileNotFoundException;
import ph.cpi.rest.api.storage.StorageProperties;

@Service
public class StorageServiceImpl implements StorageService {

	 private final Path rootLocation;
	 
	 @Autowired
	    public StorageServiceImpl(StorageProperties properties) {
	        this.rootLocation = Paths.get(properties.getLocation());
	    }
	
	 @Override
	    public void store(MultipartFile file) {
	        String filename = StringUtils.cleanPath(file.getOriginalFilename());
	        try {
	            if (file.isEmpty()) {
	                throw new StorageException("Failed to store empty file " + filename);
	            }
	            if (filename.contains("..")) {
	                // This is a security check
	                throw new StorageException(
	                        "Cannot store file with relative path outside current directory "
	                                + filename);
	            }
	            try (InputStream inputStream = file.getInputStream()) {
	                Files.copy(inputStream, this.rootLocation.resolve(filename),
	                    StandardCopyOption.REPLACE_EXISTING);
	            }
	        }
	        catch (IOException e) {
	            throw new StorageException("Failed to store file " + filename, e);
	        }
	    }

		@Override
		    public Stream<Path> loadAll() {
	        try {
	            return Files.walk(this.rootLocation, 1)
	                .filter(path -> !path.equals(this.rootLocation))
	                .map(this.rootLocation::relativize);
	        }
	        catch (IOException e) {
	            throw new StorageException("Failed to read stored files", e);
	        }

	    }
		
		 @Override
		    public Path load(String filename) {
		        return rootLocation.resolve(filename);
		    }

		 @Override
		    public Resource loadAsResource(String filename) {
		        try {
		            Path file = load(filename);
		            Resource resource = new UrlResource(file.toUri());
		            if (resource.exists() || resource.isReadable()) {
		                return resource;
		            }
		            else {
		                throw new StorageFileNotFoundException(
		                        "Could not read file: " + filename);

		            }
		        }
		        catch (MalformedURLException e) {
		            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
		        }
		    }
	 
		 	@Override
		    public void deleteAll() {
		        FileSystemUtils.deleteRecursively(rootLocation.toFile());
		        
		    }
		 	
		 	@Override
		 	public Integer delete(String fileNames){
		 		Path path = Paths.get(rootLocation + "\\" + fileNames);
		 		System.out.println(path);
		 		if(FileSystemUtils.deleteRecursively(path.toFile())){
		 			return 1;
		 		}else{
		 			return 0;
		 		}
		 	}

		    @Override
		    public void init() {
		        try {
		            Files.createDirectories(rootLocation);
		        }
		        catch (IOException e) {
		            throw new StorageException("Could not initialize storage", e);
		        }
		    }
	
	
	

}
