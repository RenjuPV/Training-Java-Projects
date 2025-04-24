package com.training.task;

public class CounterReadingTask implements Runnable{
	Counter counter;
	
	

	public CounterReadingTask(Counter counter) {
		super();
		this.counter = counter;
	}



	@Override
	public void run() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int temp=counter.getCount();
		String tname=Thread.currentThread().getName();
		System.out.println(tname+" "+temp);
		
	}

}
