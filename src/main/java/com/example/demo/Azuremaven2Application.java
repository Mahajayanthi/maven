package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Azuremaven2Application {
	@RequestMapping("/save)
	public String hello()
			{
				return"welcome to Azure";
			}

	public static void main(String[] args) {
		SpringApplication.run(Azuremaven2Application.class, args);
	}

}
