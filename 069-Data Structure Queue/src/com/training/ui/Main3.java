package com.training.ui;

import com.training.ds.Queue;
import com.training.ds.SimpleQueueImpl;

public class Main3 {
	
	public static void main(String[] args) {
		
		Queue<String>queue=null;
		
		try {
			queue=new SimpleQueueImpl<>(5);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			queue.enqueue("Jancy");
			queue.enqueue("Kiran");
			queue.enqueue("Ram");
			queue.enqueue("Reshmi");
			queue.enqueue("Menaka");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(queue);
		String r=queue.getFront();
		System.out.println(r);
		try {
			queue.dequeue();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println(queue);
		r=queue.getFront();
		System.out.println(r);
		try {
			queue.dequeue();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
