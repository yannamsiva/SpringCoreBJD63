package com.shiva.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name")String name)
	{
		return "Good Morning "+ name;
	}
}
