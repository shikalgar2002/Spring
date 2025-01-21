package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Transaction_aop {
	
	@Around("execution (* com.entity.Transaction.*())")
	public void aroundTransaction(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(" Dear customer your meter number: 18486877 bill due amount:700 plz pay ");
		
		jp.proceed();
		
		System.out.println(" Payment succesffull...");
		
	}
}
