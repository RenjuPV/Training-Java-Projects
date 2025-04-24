package com.training.ui;

import com.training.task.OddNumberPrintingTask;
import com.training.workers.CityNamePrintingThread;
import com.training.workers.SumFindingThread;

public class Main1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new CityNamePrintingThread();//new state
		t1.setName("CNPT");
		t1.start();//Runnable state
		
		
		Runnable r1=new OddNumberPrintingTask(30,50);
		Thread t2=new Thread(r1,"ONPT");
		t2.start();
		
		Thread t3=new SumFindingThread("SFT", 5, 10);//new state
		t3.start();
		
		
		
		t1.join();
		t2.join();
		t3.join();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
		System.out.println("is t1 alive:"+t1.isAlive());
		System.out.println("is t2 alive:"+t2.isAlive());
		System.out.println("is t3 alive:"+t3.isAlive());
		
	}

}
