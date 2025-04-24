package com.training.ui;

import com.training.ds.DoubleQueue;

public class Main2 {
	
	public static void main(String[] args)  {
		DoubleQueue queue=null;
		try {
			queue = new DoubleQueue(6);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			queue.enqueue(10.00);
			queue.enqueue(20.0);
			queue.enqueue(30.0);
			queue.enqueue(40.0);
			queue.enqueue(50.0);
			queue.enqueue(60.0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		double r=queue.getFront();
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
