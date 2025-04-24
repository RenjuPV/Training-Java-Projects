package com.training.ui;

import com.training.dp.Circle;
import com.training.dp.CircleAdapter;
import com.training.dp.Shape;
import com.training.dp.Square;
import com.training.dp.SquareAdapter;

public class Main1 {

	public static void main(String[] args) {

		Shape s = null;

		Circle c = new Circle(10);
		s = new CircleAdapter(c);
		System.out.println("Circle area :" + s.getArea());

		Square sq = new Square(30.0);
		s = new SquareAdapter(sq);
		System.out.println("Square Area :" + s.getArea());

	}

}
