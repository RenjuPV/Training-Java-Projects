package com.training.model;

public class A {

	private int x;
	private B obj;
	
	

	public A() {
		
		obj = new B();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void printX() {
		System.out.println(x );
	}

	public B getObj() {
		return obj;
	}


	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

	public class B {//Regular inner class
		private int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void printY() {
			System.out.println(x + "," + y);
		}
	}

}
