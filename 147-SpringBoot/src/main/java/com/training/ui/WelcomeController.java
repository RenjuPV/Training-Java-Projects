package com.training.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String f1(Model model) {
		model.addAttribute("message","Welcome to Spring Boot World!!!!");
		return "welcome";
	}

}
