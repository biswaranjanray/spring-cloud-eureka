package com.spring.cloud.eureka.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingCartClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/payment/{price}")
	public String callPaymentGatewayService(@PathVariable int price) {
		String url = "http://PAYMENT-GATEWAY-SERVICE/payment-gateway-service/payment-status/" +price;
		return restTemplate.getForObject(url, String.class);
	}
	
}
