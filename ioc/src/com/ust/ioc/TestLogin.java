package com.ust.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLogin {

	public static void main(String[] args) {
//		Login login =new Login();
//		login.setUserName("johndoe");
//		login.setPassword("winnyminny");//login depends on connection.
//		String result = login.validate();
		
		
		//System.out.println(result);
		
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("beans.xml"));
		//all beans are auto-promoted to Object type
		Object obj = factory.getBean("connection");
		Connection con=(Connection)obj;//if we use .getbean then connection will go to a supertype so convert to type of connection so downcasting
		System.out.println(obj);
		Object  obj2=factory.getBean("Login");
		Login login =(Login)obj2;
		login.validate();
	}
}
