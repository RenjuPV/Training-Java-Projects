package com.training.ui;

import com.training.model.Rectangle;
import com.training.model.Square;

public class Main1 {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(5);
		System.out.println(rectangle.getArea());
		
		Square square=new Square();
		square.setHeight(10);
		System.out.println(square.getArea());
		
	}

}
