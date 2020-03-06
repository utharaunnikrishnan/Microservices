package com.example.CustomerMicroservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class CustomerApplication {
	
	public static final String STOCKS_SERVICE_URL = "http://STOCKS-MICROSERVICE";
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public RemoteStockRepository stockRepository(){
		return new RemoteStockRepository(STOCKS_SERVICE_URL);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(CustomerApplication.class,args);
		
		

	}

}
