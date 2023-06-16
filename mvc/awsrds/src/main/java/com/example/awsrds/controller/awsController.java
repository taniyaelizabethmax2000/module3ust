package com.example.awsrds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.awsrds.entity.awsEntity;
import com.example.awsrds.service.awsService;

@RestController
@RequestMapping("/awsentity/products/api1.0")
public class awsController {

	@Autowired
	awsService service;
	
	
	
//	@PostMapping
//	@RequestMapping("/create")
//	public awsEntity addProduct(@RequestBody awsEntity aws) {
//		return service.create(aws);
//	}
	
	@PostMapping("/create")
	//@RequestMapping()
	public String addProduct(@RequestBody awsEntity aws) {
		
		 return service.create(aws);
		
	}
	
	@GetMapping("/retrieve/{id}")
	//@RequestMapping("")
	public awsEntity fetchProduct(@PathVariable int id) {
		return service.getproduct(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deletepro(id);
		
	}
	
	@PutMapping("/update/{id}")
	public awsEntity updateProduct(@RequestBody awsEntity aws) {
		return service.updatepro(aws);
	}
	
}
