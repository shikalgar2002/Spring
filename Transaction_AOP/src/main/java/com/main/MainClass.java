package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Transaction;

public class MainClass {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Transaction tr =context.getBean(Transaction.class);
		tr.LightBill();
	}

}
