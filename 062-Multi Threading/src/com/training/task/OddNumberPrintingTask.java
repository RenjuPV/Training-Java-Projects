package com.training.task;

public class OddNumberPrintingTask implements Runnable {

	private int start;
	private int end;

	
	public OddNumberPrintingTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		int count = 0;
		for (int i = start; i <= end; i++) {

			if (i % 2 != 0)
				count++;
			System.out.println("\t" + name + ":" + i + "," + count);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println(name + " :Counted the odd numbers and result is : " + count);
	}

}
