package com.training.ui;

import com.training.ds.IntegerStack;
import com.training.ds.StringStack;

public class Main5 {
	
	public static void main(String[] args) {

		IntegerStack stack1 = new IntegerStack(5);

		
			stack1.push(Integer.valueOf(100));
			stack1.push(Integer.valueOf(200));
			stack1.push(Integer.valueOf(300));
			stack1.push(Integer.valueOf(400));
			stack1.push(Integer.valueOf(500));
			
			
			

			System.out.println(stack1);

			
			System.out.println(stack1.pop());
			System.out.println(stack1);

			System.out.println(stack1.pop());
			System.out.println(stack1);

			System.out.println(stack1.pop());
			System.out.println(stack1);
			
			

			

		}

}
