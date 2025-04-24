package com.training.ui;

public class Main03 {

	public static void main(String[] args) {

		System.out.println("Program Begins....");

		// String str="125";
		try {
			String str = "125abc";
			int x = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Program ends");
	}

}
