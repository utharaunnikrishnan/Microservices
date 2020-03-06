package com.ofss;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String display() {
		System.out.println("In service class");
		return"Hello Spring Boot";
	}

}
