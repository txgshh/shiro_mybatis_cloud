package com.xgjgas.gascloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GasTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(GasTest1Application.class, args);
	}
}
