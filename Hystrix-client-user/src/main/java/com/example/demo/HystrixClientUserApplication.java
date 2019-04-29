package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixClientUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixClientUserApplication.class, args);
	}

}
