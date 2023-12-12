package com.example.contract.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudContractTestingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudContractTestingClientApplication.class, args);
	}

	@Bean
	RestTemplate template(){
		return new RestTemplate();
	}

}
