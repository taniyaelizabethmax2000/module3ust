package com.example.awsrds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.awsrds.entity.awsEntity;
import com.example.awsrds.repository.awsRepository;

@Service
public class awsService {

	@Autowired
	awsRepository repo;
	
	//public String create(awsEntity aws) {
	//	return  repo.save(aws);
		
	//}
	
	public String create(awsEntity aws) {
		 repo.save(aws);
		 return "created"; 
	}
	public awsEntity getproduct(int id) {
		Optional<awsEntity> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
	}
	public String deletepro(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return "deleted";
	}
	public awsEntity updatepro(awsEntity aws) {
		// TODO Auto-generated method stub
	awsEntity a=null;
	Optional<awsEntity>optemp=repo.findById(aws.getId());
	if(optemp.isPresent()) {
		a=optemp.get();
		a.setName(aws.getName());
		a.setAge(aws.getAge());
		a.setJob(aws.getJob());
		a.setPlace(aws.getPlace());
		return repo.save(a);
		
	}
	else {
		return new awsEntity();
	}
	//return a;
	}

		
}
