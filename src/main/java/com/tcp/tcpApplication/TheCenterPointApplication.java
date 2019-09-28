package com.tcp.tcpApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.tcp"})
public class TheCenterPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCenterPointApplication.class, args);
	}


}