package ph.cpi.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ETSApiApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(ETSApiApplication.class, args);
	}
}

