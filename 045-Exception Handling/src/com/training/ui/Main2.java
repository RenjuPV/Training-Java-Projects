package com.training.ui;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("Program Begins....");
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[5]);
			System.out.println("Program ends");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Continuing");
		}
		System.out.println("Program ends");

	}
}
