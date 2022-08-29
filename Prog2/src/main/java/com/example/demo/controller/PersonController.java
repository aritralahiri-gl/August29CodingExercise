package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class PersonController {

	@GetMapping("/person")
	public Person homePage() {
		Person person = new Person();
		person.setPersonId(001);
		person.setPersonName("Aritra Lahiri");
		person.setPassion("Creative Thinking");
		return person;

	}

}
