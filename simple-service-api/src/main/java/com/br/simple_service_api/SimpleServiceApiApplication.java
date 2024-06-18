package com.br.simple_service_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceApiApplication.class, args);
	}

}
