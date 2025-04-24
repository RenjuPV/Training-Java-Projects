package com.training.ui;

import com.training.model.pack1.Addition;
import com.training.model.pack1.Multiplication;
import com.training.model.pack1.Subtraction;
import com.training.model.pack1.Task;

public class Main01 {
	
	public static void main(String[] args) {
		
		Task task;
		
		task=(x,y)->x+y;
		System.out.println("Sum : "+task.execute(10,20));
		
		task=(x,y)->x-y;
		System.out.println("Difference : "+task.execute(50,20));
		
		
		task=Addition :: add;//Method reference for static method
		System.out.println("Sum : "+task.execute(10,20));
		
		task=Subtraction :: subtact;//Method reference for static method
		System.out.println("Difference : "+task.execute(50,20));
		
		
		task=Multiplication :: multiply;//Method reference for static method
		System.out.println("Product : "+task.execute(50,20));
		
		
	}

}
