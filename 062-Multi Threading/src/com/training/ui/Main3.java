package com.training.ui;

import com.training.task.FlightDeparturePrintingTask;
import com.training.task.OddNumberPrintingTask;

public class Main3 {
	
	public static void main(String[] args) {
		
		Runnable runnable=new OddNumberPrintingTask(10,20);
		
		Thread t1=new Thread(runnable,"ONPT-1");
		t1.start();
		
		Thread t2=new Thread(runnable,"ONPT-2");
		t2.start();
		
		Thread t3=new Thread(runnable,"ONPT-3");
		t3.start();
		
		
		
		
		Thread t4=new Thread(new FlightDeparturePrintingTask(),"Flight Departure PT");
		t4.start();
		
		
		Runnable runnable1=()->{
			String name=Thread.currentThread().getName();
			for(int i=1;i<=10;i++) {
				System.out.println(name+" : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t5=new Thread(runnable1,"NPT");
		t5.start();
		
		
		Thread t6=new Thread(()->{
			String name=Thread.currentThread().getName();
			System.out.println(name+" : "+10000);
			System.out.println(name+" : "+20000);
			System.out.println(name+" : "+30000);
		},"SPT");
		
		t6.start();
		
		
	}

}
