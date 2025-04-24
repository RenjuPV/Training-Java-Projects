package com.training.ui;

import com.training.ds.DoubleStack;

public class Main3 {
	public static void main(String[] args) {

		DoubleStack stack1 = new DoubleStack(100);

		byte v1 = 5;
		short v2 = 15;
		int v3 = 12;
		long v4 = 15;
		char v5 = 'A';
		float v6 = 10.0f;
		double v7 = 10.0;
		stack1.push(v1);
		stack1.push(v2);
		stack1.push(v3);
		stack1.push(v4);
		stack1.push(v5);
		stack1.push(v6);
		stack1.push(v7);

		System.out.println(stack1);

		double r = stack1.pop();
		System.out.println(r);
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

	}

}
