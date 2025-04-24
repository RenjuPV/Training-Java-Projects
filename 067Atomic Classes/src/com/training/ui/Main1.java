package com.training.ui;

import java.util.concurrent.atomic.AtomicInteger;

public class Main1 {
	
	public static void main(String[] args) {
		
		AtomicInteger ai;
		ai=new AtomicInteger(20);
		
		System.out.println(ai.get());
		System.out.println(ai.incrementAndGet());
		ai.set(100);
		System.out.println(ai.getAndAdd(10));
		
		System.out.println(ai.get());
		System.out.println(ai.decrementAndGet());
		System.out.println(ai.get());
		
		
		
	}

}
