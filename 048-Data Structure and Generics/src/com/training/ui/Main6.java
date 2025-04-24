package com.training.ui;

import com.training.ds.CircleStack;
import com.training.model.Circle;

public class Main6 {
	public static void main(String[] args) {

		CircleStack stack1 = new CircleStack(5);

		Circle c = new Circle(20);

		stack1.push(c);
		stack1.push(new Circle(30));
		stack1.push(new Circle(10));
		stack1.push(new Circle(100));
		stack1.push(new Circle(60));

		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

	}

}
