package com.tactfactory.microservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCurrencyexchangeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrencyexchangeserviceApplication.class, args);
	}
}
