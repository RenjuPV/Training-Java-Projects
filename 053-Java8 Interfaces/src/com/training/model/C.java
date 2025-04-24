package com.training.model;

public class C implements A,B,X{

	@Override
	public void f1() {
		System.out.println("f1 in C Class");
	}
	
	@Override
	public void f2() {
		System.out.println("f2 in C Class");
	}

	@Override
	public void f4() {
		System.out.println("f4 in C Class");
	}

	@Override
	public void test3() {
		System.out.println("test3 in C class");
		
	}
	
	@Override
	public void test1() {
		System.out.println("test1 in C class");
		
	}
	
}
