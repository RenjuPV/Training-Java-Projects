package com.training.model;

public class ShapeFactory {

	public static Shape createShape(int type) {//Creational design pattern
		
	//public  Shape createShape(int type) {//instance method is also allowed
	//public  Shape createShape(int type,int size) {
		
		
		Shape shape = null;

		if (type == 1)
			shape = new CircleImpl();

		if (type == 2)
			shape = new SquareImpl();

		if (type == 3)
			shape = new RectangleImpl();

		return shape;
	}

}
