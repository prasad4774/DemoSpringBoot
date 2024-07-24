package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/get")
	public String name()
	{
		
		System.out.println("abc");
		return "Demo Spring Boot";
		
	}
}
