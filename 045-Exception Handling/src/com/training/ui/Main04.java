package com.training.ui;

public class Main04 {
	public static void main(String[] args) {

		System.out.println("Program Begins....");

		// String str = "Renju";
		try {
			String str = null;
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		

		System.out.println("Program ends");
	}

}
