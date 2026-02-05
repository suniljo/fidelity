package com.fidelity.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "LIBRARY MANAGEMENT SYSTEM", 
								version = "2.0", 
								description = "Add Books to Library, Search and Delete Books",
								contact = @Contact(name = "Sunil Joseph", email = "sunil.j@example.com")))

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
