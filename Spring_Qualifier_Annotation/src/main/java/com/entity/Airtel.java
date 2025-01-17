package com.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel  implements Sim{

	@Override
	public String Calling() {
		// TODO Auto-generated method stub
		return "U R Calling from Airtel";
	}
	

}
