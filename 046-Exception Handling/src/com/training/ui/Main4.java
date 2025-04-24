package com.training.ui;

import java.util.Arrays;

public class Main4 {

	static void createArray(int size) {
		try {
			double[] arr = new double[size];
			System.out.println(Arrays.toString(arr));
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();

		} finally {
			System.out.println("Thank you");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program begins.....");
		createArray(10);
		System.out.println("----------------------");
		createArray(5);
		System.out.println("----------------------");
		createArray(0);
		System.out.println("----------------------");
		createArray(-40);
		System.out.println("----------------------");
		createArray(25);
		System.out.println("----------------------");
		System.out.println("Program ends.....");

	}

}
