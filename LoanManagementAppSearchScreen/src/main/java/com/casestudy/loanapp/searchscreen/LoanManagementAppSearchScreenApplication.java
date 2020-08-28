package com.casestudy.loanapp.searchscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanManagementAppSearchScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementAppSearchScreenApplication.class, args);
	}

}
