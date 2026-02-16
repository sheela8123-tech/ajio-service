package com.ajio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AjioUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjioUserApplication.class, args);
	}

}
