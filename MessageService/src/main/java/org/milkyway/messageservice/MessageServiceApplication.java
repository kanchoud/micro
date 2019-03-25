package org.milkyway.messageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("org.milkyway.messageservice")
public class MessageServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MessageServiceApplication.class, args);
	}
}

