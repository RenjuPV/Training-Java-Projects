package com.training.task;

import java.util.concurrent.Callable;

public class SummingTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			Thread.sleep(1000);
			String tName = Thread.currentThread().getName();
			System.out.println(tName + ":" + sum);
		}
		return sum;
	}

}
