package com.balagi.balagiratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalagiRatingServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BalagiRatingServiceApplication.class, args);
	}

}
