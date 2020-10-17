package com.hello.springhelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/{msg}")
	public String welcomeMsg(@PathVariable("msg") String msg) {
		return "Hi welcome "+msg;
	}
	
}
