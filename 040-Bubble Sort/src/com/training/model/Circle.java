package com.training.model;

public class Circle implements Comparable{
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

	@Override
	public int compareTo(Object o) {
		Circle other=(Circle)o;
		return this.radius-other.radius;
		
	}
	 public double getArea() {
		 return 3.14*this.radius*this.radius;
	 }

	@Override
	public String toString() {
		return "\nCircle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}
	

}
