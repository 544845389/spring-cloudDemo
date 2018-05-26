package com.codingapi.consul_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
public class Consul_2Application {

	public static void main(String[] args) {
		SpringApplication.run(Consul_2Application.class, args);
	}

//	@Bean
//	public AlwaysSampler defaultSampler(){
//		return new AlwaysSampler();
//	}

}
