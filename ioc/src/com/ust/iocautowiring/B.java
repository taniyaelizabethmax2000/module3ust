package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	public B() {
		
	}

public B(A a) {
	this.a=a;
	System.out.println("from B() constructor.....");
}
@Qualifier("a")
public void setA(A a) { //byName byType will use setter injection
	System.out.println("setA() called...");
	this.a=a;
}

@PostConstruct //this annotations treat the following method as init() ,we can give any name .after constructor is called this will execute
public void setUp() {
	System.out.println("from setUp()...");
}
@PreDestroy
public void windup() {
	System.out.println("from windup()....");
}
}
