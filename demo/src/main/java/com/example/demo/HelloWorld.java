package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Tran Quoc Mai hoc Spring thu lai";
	}
}
