package com.training.ui;

public class Main3 {
	
	static void calculate(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();

		} finally {
			System.out.println("Thank you");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program begins.....");
		calculate(20, 10);
		System.out.println("----------------------");
		calculate(20, 0);
		System.out.println("----------------------");
		calculate(200, 5);
		System.out.println("----------------------");
		System.out.println("Program ends.....");

	}

}
