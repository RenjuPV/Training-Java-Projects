package com.training.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String f1() {
		return "Hello How are you?";
	}
	

}
