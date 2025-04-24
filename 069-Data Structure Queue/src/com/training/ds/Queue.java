package com.training.ds;

public interface Queue<T> {
	
	void enqueue(T data) throws Exception;
	T getFront();
	void dequeue() throws Exception;
	
	
	

}
