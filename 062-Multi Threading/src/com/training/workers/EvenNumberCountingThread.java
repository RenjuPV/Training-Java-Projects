package com.training.workers;

public class EvenNumberCountingThread extends Thread{
	
	private int start;
	private int end;
	
	public EvenNumberCountingThread(String name, int start, int end) {
		super(name);
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%2==0)
				count++;
			System.out.println("\t\t"+name+":"+i+","+count);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name +" :Counted the even numbers and result is : "+count);
	}
	

}
