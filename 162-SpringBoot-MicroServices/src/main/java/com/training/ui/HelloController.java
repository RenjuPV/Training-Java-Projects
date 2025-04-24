package com.training.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Calculator;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String f1() {
		return "hello";
	}
	
	@PostMapping("/add/{a}/{b}")
	public int f2(@PathVariable(name="a") int a,@PathVariable(name="b")int b) {
		Calculator calculator=new Calculator();
		return calculator.add(a, b);
		
	}
	
	@PostMapping("/subtract/{a}/{b}")
	public int f3(@PathVariable(name="a") int a,@PathVariable(name="b")int b) {
		Calculator calculator=new Calculator();
		return calculator.subtract(a, b);
		
	}
	
	@PostMapping("/multiply/{a}/{b}")
	public int f4(@PathVariable(name="a") int a,@PathVariable(name="b")int b) {
		Calculator calculator=new Calculator();
		return calculator.multiply(a, b);
		
	}
	
	@PostMapping("/divide/{a}/{b}")
	public int f5(@PathVariable(name="a") int a,@PathVariable(name="b")int b) {
		Calculator calculator=new Calculator();
		return calculator.divide(a, b);
		
	}
	
	

}
