package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello, World!";
	}

	@GetMapping("/goodbye")
	public String sayGoodBye(){
		return "Goodbye, Kimino Unmeino hitowa boku janai";
	}

	@GetMapping("/hey")
	public String sayHey(){
		return "Hey hey, samurai heart";
	}
}
