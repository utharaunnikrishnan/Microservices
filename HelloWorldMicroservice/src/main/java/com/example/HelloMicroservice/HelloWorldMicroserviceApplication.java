package com.example.HelloMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMicroserviceApplication.class, args);
	}
}
 
