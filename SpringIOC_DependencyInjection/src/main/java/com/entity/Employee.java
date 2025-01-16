package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	@Value("12345")
	private int emp_id;
	@Value("Ruturaj")
	private String emp_name;
	@Value("700000")
	private long salary;
	
	@Autowired(required = true)
	private Department dept;

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", dept=" + dept + "]";
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int emp_id, String emp_name, long salary, Department dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
