package com.training.ui;

import com.training.ds.LongStack;

public class Main2 {
	public static void main(String[] args) {
		
		LongStack stack1 = new LongStack(100);
		stack1.push(20);
		stack1.push(10);
		stack1.push(15);
		stack1.push(45);
		stack1.push(60);
		stack1.push(75);
		System.out.println(stack1);
		
		
		byte v1 = 5;
		short v2 = 15;
		int v3=12;
		long v4 = 15; 
		char v5='A';
		//double v6 = 10.0;
		stack1.push(v1);
		stack1.push(v2);
		stack1.push(v3);
		stack1.push(v4);
		stack1.push(v5);
		//stack1.push(v6);
		
		System.out.println(stack1);


		long r = stack1.pop();
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
