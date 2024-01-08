package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  
	@GetMapping
	public String getMsg() {
		return "welcome to my project";
	}
}
