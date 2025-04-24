package com.training.ui;

import com.training.model.Shape;
import com.training.model.ShapeFactory;

public class Main1 {
	
	public static void main(String[] args) {
		
		//Shape shape=new ShapeFactory();
		
		Shape shape;
		shape=ShapeFactory.createShape(1);
		shape.setSize(10);
		System.out.println(shape.getArea());
		
		
		shape=ShapeFactory.createShape(2);
		shape.setSize(15);
		System.out.println(shape.getArea());
		
		shape=ShapeFactory.createShape(3);
		shape.setSize(15);
		System.out.println(shape.getArea());
		
		
		
		
	}

}
