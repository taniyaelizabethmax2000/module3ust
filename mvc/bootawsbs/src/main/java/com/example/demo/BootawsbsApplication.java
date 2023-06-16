package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class BootawsbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootawsbsApplication.class, args);
	}

	
	@GetMapping
	@RequestMapping(value="/test")
	public String message() {
		
		return "success";
	}
}
