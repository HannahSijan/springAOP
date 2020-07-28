package com.edureka.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.services.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
//UserServiceImpl userServiceImplConcrete=(UserServiceImpl) context.getBean("userService");
//userServiceImplConcrete.addUser();	

System.out.println("proxy implementation starting Before and after advisor..........");
UserServiceImpl userServiceImplProxy=(UserServiceImpl) context.getBean("proxy");
userServiceImplProxy.addUser();	
System.out.println("proxy1 implementation starting AroundAdvisor..........");

UserServiceImpl userServiceImplProxy1=(UserServiceImpl) context.getBean("proxy1");
userServiceImplProxy1.addUser();


	
	}

}
