package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserDetails;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public UserDetails hello() {
		return new UserDetails("Aditya","Sadaphule","Mumbai");
	}
}
