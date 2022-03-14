package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	@RequestMapping("/hello")
	public String hello() {
		return "welcome to STG Infotech";
	}

}
