package ph.cpi.rest.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import ph.cpi.rest.api.service.StorageService;
import ph.cpi.rest.api.storage.StorageProperties;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties(StorageProperties.class)

public class ETSApiApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(ETSApiApplication.class, args);
	}
	
	 @Bean
	 CommandLineRunner init(StorageService storageService) { 
	        return (args) -> {
	            //storageService.deleteAll();  //commented out because this will delete the uploaded files when web service is restarted
	            storageService.init();
	 };
  }
}

