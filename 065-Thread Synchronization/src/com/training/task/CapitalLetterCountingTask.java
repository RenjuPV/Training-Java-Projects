package com.training.task;

public class CapitalLetterCountingTask  implements Runnable{
	
	String str="Welcome to UST-Global,India.Hope you are doing good";

	@Override
	public synchronized void run() {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
				
			System.out.println(Thread.currentThread().getName()+" "+count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+""+count +" Completed");
		
	}

}
