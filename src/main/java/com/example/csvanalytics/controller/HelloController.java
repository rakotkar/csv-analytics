package com.example.csvanalytics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.csvanalytics.model.Greeting;

@RestController
public class HelloController {

	
	@GetMapping("/greet")
	public Greeting greet() {
		return new Greeting(1, "good morning");
	}
	
}
