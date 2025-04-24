package com.training.model;

public interface X {

	void test3();

	default void test1() {
		System.out.println("test1 in interface X");
	}

	static void test2() {
		System.out.println("test2 in interface X");
	}

}
