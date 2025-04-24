package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.HelloWorld;

public class Main02 {
	public static void main(String[] args) {
		
		HelloWorld hello;

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		hello = (HelloWorld) context.getBean("helloWorldBean");

		System.out.println(hello.getMessage());
		System.out.println(hello.toString());
		hello.setMessage("Hi..this is my new message");
		System.out.println(hello.getMessage());

		
	}

}
