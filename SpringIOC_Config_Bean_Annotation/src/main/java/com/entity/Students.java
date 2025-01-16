package com.entity;

import org.springframework.beans.factory.annotation.Value;

public class Students {
	@Value("1")
	private int S_id;
	@Value("Salman")
	private String S_name;
	@Value("Pune")
	private String City;
	@Value("22")
	private int age;
	
	
	
	
	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}







	public Students(int s_id, String s_name, String city, int age) {
		super();
		S_id = s_id;
		S_name = s_name;
		City = city;
		this.age = age;
	}







	public int getS_id() {
		return S_id;
	}







	public void setS_id(int s_id) {
		S_id = s_id;
	}







	public String getS_name() {
		return S_name;
	}







	public void setS_name(String s_name) {
		S_name = s_name;
	}







	public String getCity() {
		return City;
	}







	public void setCity(String city) {
		City = city;
	}







	public int getAge() {
		return age;
	}







	public void setAge(int age) {
		this.age = age;
	}







	@Override
	public String toString() {
		return "Students [S_id=" + S_id + ", S_name=" + S_name + ", City=" + City + ", age=" + age + "]";
	}
	
	

}
