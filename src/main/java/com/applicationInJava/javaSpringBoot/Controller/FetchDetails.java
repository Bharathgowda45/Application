package com.applicationInJava.javaSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FetchDetais")
public class FetchDetails {
	
	
	@GetMapping("/empDetails")
	public String tellSomthing() {
		return "mep:123";
	}
	
	@GetMapping("/nameDetails")
	public String getNameInput(@RequestParam(name="firstName") String firstName,@RequestParam(name="secondName") String secondName,@RequestParam(name="lastName") String lastName) {
		return firstName+" "+secondName+" "+lastName;
	}

}
