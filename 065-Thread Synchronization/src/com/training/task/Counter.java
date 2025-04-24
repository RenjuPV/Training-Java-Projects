package com.training.task;

public class Counter {
	
	int count=0;
	
	public synchronized int getCount() {
		return count;
	}
	
	public synchronized void increment() {
		for(int i=1;i<=10;i++) {
			count++;
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" : "+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
