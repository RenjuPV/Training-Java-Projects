package com.training.ui;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.task.MinimumFinder;

public class Main6 {
public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Double> callable;
		
		Double[] numArray= {20.0,30.0,40.0,50.0};
		callable=new MinimumFinder(numArray);
		
		ExecutorService es;
		es=Executors.newSingleThreadExecutor();
		
		Future<Double>future=es.submit(callable);
		
		while(! future.isDone()) {
			System.out.println("Please wait...computation is happening");
		}
		Double result=future.get();
		System.out.println("Minimum :"+result);
		es.shutdown();
		
	
		
		
	}

}
