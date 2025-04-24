package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
	
	public static void main(String[] args) {
		
		List<Integer>iList=new ArrayList<>();
		
		Runnable runnable1=()->{
			synchronized (iList) {
				for(int i=1;i<=10;i++)
					iList.add(i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		
		Runnable runnable2=()->{
			synchronized (iList) {
				for(int i=10;i<=20;i++)
					iList.add(i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
		
		Thread t1=new Thread(runnable1,"t1");
		Thread t2=new Thread(runnable2,"t2");
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(iList);
		System.out.println(iList.size());
		
		
	}

}
