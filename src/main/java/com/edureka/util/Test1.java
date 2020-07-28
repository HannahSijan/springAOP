package com.edureka.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.services.LoginService;

public class Test1 {
	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-core.xml");
		
		System.out.println("proxy implementation starting");
		LoginService obj =(LoginService) context.getBean("loginservice");
		
		
		obj.login("merin", 3);

	
	
	
	
	
	}
}

