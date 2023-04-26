package com.javatechie.spring.docker1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDocker1Application {
	
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "welcome to the home page";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDocker1Application.class, args);
	}

}
