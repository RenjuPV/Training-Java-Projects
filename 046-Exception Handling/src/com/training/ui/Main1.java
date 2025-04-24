package com.training.ui;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("Program begins.....");
		try {
			System.out.println(Integer.parseInt("abcd"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Continuing....");
		} finally {
			System.out.println("Thank you....");
		}

		System.out.println("Program ends.....");

	}

}
