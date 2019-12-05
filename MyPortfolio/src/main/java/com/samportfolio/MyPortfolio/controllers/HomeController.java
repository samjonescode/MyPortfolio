package com.samportfolio.MyPortfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String showHome() {
		return "Welcome to my portfolio site... it's under construction. Please go to /resume for now.";
	}
	
}
