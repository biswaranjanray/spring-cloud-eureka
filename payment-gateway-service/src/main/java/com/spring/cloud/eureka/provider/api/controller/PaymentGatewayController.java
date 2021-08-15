package com.spring.cloud.eureka.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-gateway-service")
public class PaymentGatewayController {

	@GetMapping("/payment-status/{price}")
	public String paymentStatus(@PathVariable int price) {
		return "The payment of " + price + " is processed successfully...";
	}
}
