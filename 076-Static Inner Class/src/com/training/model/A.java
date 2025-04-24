package com.training.model;

public class A {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void printX() {
		System.out.println("X :" + x);
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}

	public static class B {// static inner class

		private int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "B [y=" + y + "]";
		}

		public void printy() {
			System.out.println("Y" + y);
			// System.out.println(x+","+y); static class can not access instance variable of
			// outerclass
		}

	}

}
