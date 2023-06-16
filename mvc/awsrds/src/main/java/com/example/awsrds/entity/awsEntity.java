package com.example.awsrds.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aws")
public class awsEntity {

@Id
@GeneratedValue
private int id;
private String name;
private int age;
private String job;
private String place;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public awsEntity() {

}
public awsEntity(int id, String name, int age, String job, String place) {
	
	this.id = id;
	this.name = name;
	this.age = age;
	this.job = job;
	this.place = place;
}




}
