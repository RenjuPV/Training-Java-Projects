package com.training.ui;

public class Main04 {

	public static void main(String[] args) {

		Runnable runnable1 = () -> {

			String name = Thread.currentThread().getName();
			for (int i = 200; i >= 100; i--) {
				System.out.println(name + " : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(runnable1, "RNPT");
		t1.start();

		Thread t6 = new Thread(() -> {

			String name = Thread.currentThread().getName();

		

			for (int i = 1; i <= 100; i++) {
				if(i%5==0)
				System.out.println(name + " : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}, "MFPT");

		t6.start();

	}

}
