package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootClientApplication.class, args);
	}
	
	@GetMapping

	 public String hi() {

	 return "Eureka Client App up and running here !!";

	 }

}
