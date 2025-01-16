package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {

	@Value("2")
	private int d_id;
	@Value("java-developer")
	private String d_name;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + "]";
	}
	public Department(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
