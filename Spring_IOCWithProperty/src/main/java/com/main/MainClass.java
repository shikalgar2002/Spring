package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Students;

public class MainClass {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Students s =context.getBean("stud",Students.class);
		System.out.println(s);
//		s.setStud_age(22);
//		s.setStud_id(1);
//		s.setStud_name("ruturaj");
//		s.setStud_city("chinchwad");
		
		s=context.getBean("stud1",Students.class);
		
		System.out.println(s);
		
	}

}


