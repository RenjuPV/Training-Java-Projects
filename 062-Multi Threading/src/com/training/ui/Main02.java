package com.training.ui;

import com.training.workers.CityNamePrintingThread;
import com.training.workers.EvenNumberCountingThread;
import com.training.workers.NumberPrintingThread;
import com.training.workers.SumFindingThread;

public class Main02 {

	public static void main(String[] args) {

		System.out.println("Program Begins...");
		System.out.println("Welcome");

		Thread t1 = new CityNamePrintingThread();
		t1.setName("City Printing thread");
		t1.start();

		Thread t2 = new NumberPrintingThread();
		t2.setName("Number Printing Thread");
		t2.start();
		
		
		Thread t3 = new SumFindingThread("Sum Finder",1,10);
		t3.start();

		
		Thread t4=new EvenNumberCountingThread("Even number Counting", 100,250);
		t4.start();
		System.out.println("Thank you...");

		System.out.println("Program Ends...");
	}

}
