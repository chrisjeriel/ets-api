package ph.cpi.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class ETSApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ETSApiApplication.class, args);
	}
}

