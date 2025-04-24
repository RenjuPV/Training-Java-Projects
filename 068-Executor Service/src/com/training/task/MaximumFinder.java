package com.training.task;

import java.util.concurrent.Callable;

public class MaximumFinder implements Callable<Double>{
	private Double[] dArray;
	
	
	public MaximumFinder(Double[] dArray) {
		super();
		this.dArray = dArray;
	}


	@Override
	public Double call() throws Exception {
		double max = dArray[0];
		for (Double num : dArray) {
			if (max < num)
				max = num;

		}
		String tName = Thread.currentThread().getName();
	  System.out.println(tName + ":" + max);
		return max;
	}
	

}
