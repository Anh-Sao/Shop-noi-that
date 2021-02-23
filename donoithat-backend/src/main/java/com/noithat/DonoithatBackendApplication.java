package com.noithat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DonoithatBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonoithatBackendApplication.class, args);
	}

}
