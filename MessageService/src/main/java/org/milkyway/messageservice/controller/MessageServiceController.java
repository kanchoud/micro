package org.milkyway.messageservice.controller;

import org.milkyway.messageservice.proxy.GreetingsServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceController {
	@Autowired
	GreetingsServiceProxy greetingsServiceProxy;
	
	
	@GetMapping("/message")
	public String getMyMessage(){
		String greetingsMsg=greetingsServiceProxy.getGreetings();
		return "Hello Random person!<br/>"+greetingsMsg;
	}
	
	@GetMapping("/message/{name}")
	public String getHelloMessage(@PathVariable String name){
		String greetingsMsg=greetingsServiceProxy.getGreetings();
		return  "Hello "+name+"!<br/>"+greetingsMsg;
	}

}
