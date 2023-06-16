package com.ust.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestApplication {

 final static Logger logger=LoggerFactory.getLogger(FirstrestApplication.class);
 
	public static void main(String[] args) {
	
		SpringApplication.run(FirstrestApplication.class, args);
		
		logger.trace("Application Started successfully");
		logger.debug("Application Started successfully");
		logger.info("Application Started successfully");
		logger.warn("Application Started successfully");//yellow colour
		logger.error("Make it count");//red colour
	//default is info	
		
	}

}
