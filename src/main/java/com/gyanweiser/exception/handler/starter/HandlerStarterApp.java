package com.gyanweiser.exception.handler.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gyanweiser.exception.handler.starter")
public class HandlerStarterApp {
	public static void main(String[] args) {
		SpringApplication.run(HandlerStarterApp.class, args);
	}
}
