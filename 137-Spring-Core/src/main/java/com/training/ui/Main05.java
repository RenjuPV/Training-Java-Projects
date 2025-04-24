package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Shape;

public class Main05 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Shape shape = (Shape) context.getBean("circleBean");
		System.out.println(shape);

		shape = (Shape) context.getBean("squareBean");
		System.out.println(shape);

		shape = (Shape) context.getBean("rectangleBean");
		System.out.println(shape);

	}
}
