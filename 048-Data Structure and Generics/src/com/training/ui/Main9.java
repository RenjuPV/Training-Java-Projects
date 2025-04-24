package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Circle;
import com.training.model.Square;

public class Main9 {
	public static void main(String[] args) {

		try {

			Stack<Circle> stack1 = new StackImpl<>(3);
			stack1.push(new Circle(10));
			stack1.push(new Circle(20));
			stack1.push(new Circle(30));
			stack1.push(new Circle(40));

			System.out.println(stack1);

			Circle r = stack1.pop();
			System.out.println(r);
			System.out.println(r.getRadius() + " , " + r.getArea());

		

			StackImpl<Square> stack2 = new StackImpl<>(20);
			stack2.push(new Square(10));
			stack2.push(new Square(5));
			stack2.push(new Square(15));

			System.out.println(stack2);

			Square r2 = stack2.pop();
			System.out.println(r2);
			System.out.println(r2.getSize() + " , " + r2.getArea());
		} catch ( Throwable e) {
			System.err.println(e.getMessage());
		}

	}

}
