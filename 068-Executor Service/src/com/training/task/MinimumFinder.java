package com.training.task;

import java.util.concurrent.Callable;

public class MinimumFinder implements Callable<Double> {
	private Double[] dArray;

	public MinimumFinder(Double[] dArray) {
		super();
		this.dArray = dArray;
	}

	@Override
	public Double call() throws Exception {
		double min = dArray[0];
		for (Double num : dArray) {
			if (num < min)
				min = num;

		}
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ":" + min);
		return min;
	}

}
