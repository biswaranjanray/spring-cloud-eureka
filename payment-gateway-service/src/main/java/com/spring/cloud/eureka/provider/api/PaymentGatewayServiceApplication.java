package com.spring.cloud.eureka.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentGatewayServiceApplication.class, args);
	}

}
