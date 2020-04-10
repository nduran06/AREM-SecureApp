package edu.escuelaing.arem.secureapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "edu.escuelaing.arem.secureapp" })
public class SecureServiceAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureServiceAPIApplication.class, args);
	}


}
