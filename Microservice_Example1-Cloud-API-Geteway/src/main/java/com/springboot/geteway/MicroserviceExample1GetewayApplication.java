package com.springboot.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
public class MicroserviceExample1GetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceExample1GetewayApplication.class, args);
	}

}
