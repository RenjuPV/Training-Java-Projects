package com.training.task;

import java.util.concurrent.Callable;

public class SumFinder implements Callable<Double>{

	@Override
	public Double call() throws Exception {
		
		double sum = 0.0;
		double[] dArray= {20.0,30.0,40.0,50.0,60.0};
		for (int i = 0; i <dArray.length; i++) {
			sum = sum + dArray[i];
			Thread.sleep(1000);
			String tName = Thread.currentThread().getName();
			System.out.println(tName + ":" + sum);
		}
		return sum;
	}

}
