package com.codingapi.consul_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
//@EnableCircuitBreaker
public class Consul_1Application {

	public static void main(String[] args) {
		SpringApplication.run(Consul_1Application.class, args);
	}

//	@Bean
//	public AlwaysSampler defaultSampler(){
//		return new AlwaysSampler();
//	}

}
