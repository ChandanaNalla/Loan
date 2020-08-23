package com.example.searchscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanSearchScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanSearchScreenApplication.class, args);
	}

}
