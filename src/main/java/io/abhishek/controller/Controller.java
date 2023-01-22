package io.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@Autowired
	RestTemplate get;

	@GetMapping("/get")
	public String greet() {
		String str = get.getForObject("http://demo-service/get", String.class);
		return str;
	}
	
}
