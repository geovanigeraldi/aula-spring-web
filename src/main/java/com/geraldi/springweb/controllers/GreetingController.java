package com.geraldi.springweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geraldi.springweb.services.GreetingService;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService service;

	@GetMapping("/greeting")
	public String greeting() {
		return service.greet();
	}

}