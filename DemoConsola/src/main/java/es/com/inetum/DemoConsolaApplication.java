package es.com.inetum;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.com.inetum.service.IPersonaService;
import es.com.inetum.service.IPersonaServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{
	
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		service.registrarHandler("Alvaro");

	}

}
