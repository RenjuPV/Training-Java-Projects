package com.training.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {

		//List<Integer> list1 = new ArrayList<>();
		List<Integer> list1 = Collections.synchronizedList(new ArrayList<>());
		
		Runnable runnable1 = () -> {
			for (int i = 0; i < 1000; i++) {
				list1.add(i);
			}
			System.out.println(list1);
		};

		Runnable runnable2 = () -> {
			for (int i = 1000; i <= 2000; i++) {
				list1.add(i);
			}
			System.out.println(list1);
		};

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
