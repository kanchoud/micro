package org.milkyway.greetingsservice.controller;

import org.milkyway.greetingsservice.configuration.Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsServiceController {

	@Autowired
	private Configurations configuration;

	@GetMapping("/greetings")
	public String getGreetings(){
		return configuration.getMsg();
	}

}
