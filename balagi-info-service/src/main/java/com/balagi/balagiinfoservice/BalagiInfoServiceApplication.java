package com.balagi.balagiinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//LEVEL-1
@SpringBootApplication
@EnableEurekaClient
public class BalagiInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalagiInfoServiceApplication.class, args);
		
	}

}
