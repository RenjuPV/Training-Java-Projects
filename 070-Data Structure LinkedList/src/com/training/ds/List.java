package com.training.ds;

public interface List<T> {

	void insert(T data) throws Exception;

	void insert(int position, T data) throws Exception;

	T get(int position);

	void display();

}
