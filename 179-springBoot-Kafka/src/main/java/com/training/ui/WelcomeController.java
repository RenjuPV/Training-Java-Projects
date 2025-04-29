package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService service;
	
	@GetMapping("welcome")
	public String f1(@RequestParam(name = "msg") String str) {
		service.sendToKafka(str);
		return str.toUpperCase();
	}

}
