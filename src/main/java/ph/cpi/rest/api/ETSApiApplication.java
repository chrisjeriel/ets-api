package ph.cpi.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import ph.cpi.rest.api.service.StorageService;
import ph.cpi.rest.api.storage.StorageProperties;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties(StorageProperties.class)

public class ETSApiApplication extends SpringBootServletInitializer {
	
	@Autowired
    private Environment env;
	
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
	
	@Bean
    public WebMvcConfigurer corsConfigurer()  {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String urls = env.getProperty("cors.urls");
                registry.addMapping("/**")
                		.allowedOrigins(urls.split(","));
            }
        };
    }
}	

