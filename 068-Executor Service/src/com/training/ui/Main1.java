package com.training.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.task.FileLetterCountingTask;
import com.training.task.FlightDeparturePrintingTask;
import com.training.task.OddNumberPrintingTask;
import com.training.workers.EvenNumberCountingThread;

public class Main1 {
	
	public static void main(String[] args) {
		
		Runnable runnable1=new OddNumberPrintingTask(100, 120);
		Runnable runnable2=new FlightDeparturePrintingTask();
		Runnable runnable3=()->{
			String tName=Thread.currentThread().getName();
			for(int i=0;i<=10;i++) {
				System.out.println(tName+","+"Trivndrum");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		
		Runnable runnable4=new FileLetterCountingTask("welcome.txt");
		Runnable runnable5=new EvenNumberCountingThread("ENCT", 100,120);
		
		
		//ExecutorService es=Executors.newFixedThreadPool(3);
		
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		es.submit(runnable1);
		//es.submit(runnable2);
		es.submit(runnable3);
		es.submit(runnable4);
		es.submit(runnable5);
		es.shutdown();
		
	}

}
