package com.training.ui;

import com.training.ds.DoubleStack;
import com.training.ds.StringStack;

public class Main4 {
	
	public static void main(String[] args) {

	StringStack stack1 = new StringStack(100);

	
		stack1.push("Delhi");
		stack1.push("Mumbai");
		stack1.push("Pune");
		stack1.push("Bnglr");
		
		

		System.out.println(stack1);

		
		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);

		System.out.println(stack1.pop());
		System.out.println(stack1);
		
		

		

	}

}
