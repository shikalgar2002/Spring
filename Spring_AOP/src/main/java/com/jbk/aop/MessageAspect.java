package com.jbk.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {
//
//	@Before("execution (public void recharge())")
//	public void beforeMSG() {
//		System.out.println(" U R recharge expiring soon... plz recharge...! ");
//	}
//	
//	
//	@After("execution (public void recharge())")
//	public void afterMSG() {
//		System.out.println(" Enjoy UR Data pack....");
//	}
	
	@Around("execution(* com.jbk.entity.MobileRecharge.* ())")
	public void aroundMSG(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("Plz recharge..");
		
		pj.proceed();
		System.out.println("Recharge Done");
	}
	
	
	
}
