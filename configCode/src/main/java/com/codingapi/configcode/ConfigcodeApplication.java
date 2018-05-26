package com.codingapi.configcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigcodeApplication {



	public static void main(String[] args) {
		SpringApplication.run(ConfigcodeApplication.class, args);
	}


}
