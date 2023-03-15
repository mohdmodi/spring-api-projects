package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@GetMapping(path="/hello")
	public String say() {
		return "Hello Everyone LOL";	
		}
}
