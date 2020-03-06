package com.example.springJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJdbcApplication.class, args);
		EmployeeService es=context.getBean(EmployeeService.class);
		Employee e1=new Employee("Uthara","Unnikrishnan",1234567890,"uu@sg.com");
		es.insertEmployee(e1);
	}

}
