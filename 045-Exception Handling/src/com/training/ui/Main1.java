package com.training.ui;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Program Begins....");
		int a = 100, b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.err.println("Division by zero is not possible");
			System.out.println("Continuing");
		}
		
		System.out.println("Program ends");
	}

}
