package com.training.ui;

import com.training.ds.IntStack;

public class Main1 {
	public static void main(String[] args) {
		IntStack stack1=new IntStack(10);
		stack1.push(20);
		stack1.push(10);
		stack1.push(15);
		stack1.push(45);
		stack1.push(60);
		stack1.push(75);
		System.out.println(stack1);
		
		int r=stack1.pop();
		System.out.println(r);
		System.out.println(stack1);
		

		System.out.println(stack1.pop());
		System.out.println(stack1);
		
		System.out.println(stack1.pop());
		System.out.println(stack1);
		
		System.out.println(stack1.pop());
		System.out.println(stack1);
		
		byte v1=5;
		short v2=15;
		
		stack1.push(v1);
		stack1.push(v2);
		
		
		
		
	}

}
