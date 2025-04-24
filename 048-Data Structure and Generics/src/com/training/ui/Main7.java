package com.training.ui;

import com.training.ds.SquareStack;
import com.training.model.Square;

public class Main7 {
	public static void main(String[] args) {

		SquareStack stack1 = new SquareStack(5);

		Square c = new Square(20);

		stack1.push(c);
		stack1.push(new Square(30));
		stack1.push(new Square(10));
		stack1.push(new Square(100));
		stack1.push(new Square(60));

		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

	}

}
