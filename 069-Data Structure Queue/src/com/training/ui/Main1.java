package com.training.ui;


import com.training.ds.IntQueue;

public class Main1 {
	
	public static void main(String[] args)  {
		
		IntQueue queue=null;
		try {
			queue = new IntQueue(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			queue.enqueue(10);
			queue.enqueue(20);
			queue.enqueue(30);
			queue.enqueue(40);
			queue.enqueue(50);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		int r=queue.getFront();
		System.out.println(r);
		try {
			queue.dequeue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		r=queue.getFront();
		System.out.println(r);
		try {
			queue.dequeue();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		r=queue.getFront();
		System.out.println(r);
		try {
			queue.dequeue();
		} catch (Exception e) {
			System.err.println(e.getMessage());		}
		
		
		
		System.out.println(queue.toString());
		
		
		
	}

}
