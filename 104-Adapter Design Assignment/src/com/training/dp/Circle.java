package com.training.dp;

public class Circle {
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return 3.14 * this.radius * this.radius;
	}

}
