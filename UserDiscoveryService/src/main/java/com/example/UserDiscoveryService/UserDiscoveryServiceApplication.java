package com.example.UserDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDiscoveryServiceApplication.class, args);
	}

}