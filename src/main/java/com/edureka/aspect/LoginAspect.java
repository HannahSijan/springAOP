package com.edureka.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {
	
	
 	@Before("execution(* com.edureka.services.LoginService.*(..))")
	public void logAllService(JoinPoint joinpoint)throws Throwable{
		
		System.out.println("Log Before......"+joinpoint.getSignature());
		
	}
 	

 	@After("execution(* com.edureka.services.LoginService.*(..))")
	public void logAllService2(JoinPoint joinpoint)throws Throwable{
		
		System.out.println("Log after......"+joinpoint.getSignature());
		
	}

}
