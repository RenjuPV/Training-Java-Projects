package com.training.model;

public class Circle implements Comparable<Circle>{
	int radius;

	
	
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	 public double getArea() {
		 return 3.14*this.radius*this.radius;
	 }

	@Override
	public String toString() {
		return "\nCircle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}

	@Override
	public int compareTo(Circle o) {
		return this.radius-o.radius;
	}
	

}
