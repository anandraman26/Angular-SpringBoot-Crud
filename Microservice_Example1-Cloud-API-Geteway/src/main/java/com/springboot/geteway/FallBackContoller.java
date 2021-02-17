package com.springboot.geteway;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCircuitBreaker
public class FallBackContoller {

	@RequestMapping("/userServiceFallBack")
	public String userFallBackMethod() {
		return "User service is taking longer then expected . Please try again later";
	}
	
	@RequestMapping("/departmentServiceFallBack")
	public String departmentFallBackMethod() {
		return "Department service is taking longer then expected . Please try again later";
	}
}
