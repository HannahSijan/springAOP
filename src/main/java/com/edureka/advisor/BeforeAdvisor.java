package com.edureka.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
	System.out.println("please check the authenticity of the user and add user to the database if user is autherised......");	
	}

}
