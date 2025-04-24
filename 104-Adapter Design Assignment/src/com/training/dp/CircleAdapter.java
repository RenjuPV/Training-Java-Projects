package com.training.dp;

public class CircleAdapter implements Shape {

	Circle c;

	public CircleAdapter(Circle c) {
		super();
		this.c = c;
	}

	public CircleAdapter() {
		super();
	}

	@Override
	public void setSize(double size) {
		c.setRadius(0);

	}

	@Override
	public double getArea() {

		return c.computeArea();
	}

}
