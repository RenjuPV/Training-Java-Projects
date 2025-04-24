package com.training.ui;

public class Main08 {
	public static void main(String[] args) {

		System.out.println("Program begins....");
		try {
			System.out.println(100 / 0);
			int[] arr = { 1, 2, 5, 6 };
			System.out.println(arr[1]);

			int x = Integer.parseInt("125");
			String str1 = null;
			System.out.println(str1.length());

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException
				| NullPointerException e) {
			if (e instanceof NumberFormatException) {
				System.out.println("Number format is invalid");
			}
			if (e instanceof ArithmeticException) {
				System.out.println("Division by zero is not possible");
			}
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Invalid array index");
			}
			if (e instanceof NullPointerException) {
				System.out.println("Null value encountered");
			}
		}
		System.out.println("Program ends....");
	}

}
