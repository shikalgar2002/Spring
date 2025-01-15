package com.entity;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private int age;
	private String city;
	
	private Department dept;
	
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int emp_id, String emp_name, int age, String city, Department dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
		this.city = city;
		this.dept = dept;
	}




	public int getEmp_id() {
		return emp_id;
	}




	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}




	public String getEmp_name() {
		return emp_name;
	}




	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public Department getDept() {
		return dept;
	}




	public void setDept(Department dept) {
		this.dept = dept;
	}




	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + ", city=" + city + ", dept="
				+ dept + "]";
	}
	
	
	
}
