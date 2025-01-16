package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Students;

@Configuration
public class MyConfigClass {
	
	@Bean
	public Students mystd() {
		
		
		return new Students();
		
	}

}
