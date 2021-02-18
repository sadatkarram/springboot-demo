package com.balagi.balagidiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BalagiDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalagiDiscoveryServerApplication.class, args);
	}

}
