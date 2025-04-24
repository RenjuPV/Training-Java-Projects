package com.training.ui;

public class Main01 {

	public static void main(String[] args) {

		System.out.println("Program Begins...");
		System.out.println("Welcome");
		Thread thread = Thread.currentThread();
		thread.setName("Number Printer");
		String threadName = thread.getName();
		for (int i = 0; i <= 10; i++) {
			System.out.println(threadName + "threadName :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Thank you...");

		System.out.println("Program Ends...");

	}

}
