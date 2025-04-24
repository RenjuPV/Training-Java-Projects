package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Client;

public class Main13 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Client client = (Client) context.getBean("clientBean");
		System.out.println(client);
	}

}
