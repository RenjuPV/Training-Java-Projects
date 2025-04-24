package com.training.model;

import java.util.concurrent.atomic.AtomicLong;

public class SafeLongIncrement {
	
private AtomicLong al=new AtomicLong(0);
	
	public long getValue() {
		return al.get();
	}
	
	public void increment() {
		al.incrementAndGet();
	}

}
