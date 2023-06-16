package com.ust.client.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ProductClient {

	@Autowired
	RestTemplate template;//template means 1 object abstracting many methods 
	@GetMapping
	public String testMethod() {
		//String url="http://localhost:8080/product/api.1.0";
		//we need rest template to communicate to mysqljpa so autowired resttemplate
		String url="http://localhost:8080/product/api.1.0/retrieve/1";//get the product from mysqljpa
		//op:working....{"productId":1,"name":"iphone","description":"mobile","price":67000,"qty":7}on localhost:portno:/client
		Object result=template.getForObject(url,Object.class);
		
		return "working...."+result;
	}
}
