package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.model.Employee;
import com.training.model.HelloWorld;

@Configuration
public class MyConfiguration1 {
	
	@Bean
	@Scope("prototype")
	public HelloWorld f1() {
		HelloWorld helloWorld=new HelloWorld();
		return helloWorld;
	}
	
	@Bean
	public Employee f2() {
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Renju");
		employee.setBasic(10000);
		return employee;
	}

}
