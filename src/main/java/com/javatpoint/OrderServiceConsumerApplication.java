package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class OrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceConsumerApplication.class, args);
	}

}
