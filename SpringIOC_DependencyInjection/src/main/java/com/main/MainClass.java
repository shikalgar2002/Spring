package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
     Employee e  =	context.getBean(Employee.class);
     Employee e2  =	context.getBean(Employee.class);
     
     System.out.println(e);
//     System.out.println(e==e2);
	}

}
