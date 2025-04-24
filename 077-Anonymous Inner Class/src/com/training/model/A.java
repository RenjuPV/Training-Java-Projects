package com.training.model;

public class A {
	// Anonymous inner class
	private int x;
	private B obj;
	
	public A() {
		obj= new B() {//Anonymous inner class Nameless class
			
			@Override
			public void test() {
				System.out.println("test implementation");
				
			}
		};
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	public void printX() {
		System.out.println("x =in A class " + x);
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

	public abstract class B {
		public abstract void test();

		@Override
		public String toString() {
			return "B []";
		}
		
	}

}
