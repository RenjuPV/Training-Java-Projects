package com.training.model;

 class CircleImpl implements Shape{
	
	private int radius;
	
	
	public CircleImpl() {
		super();
	}


	public CircleImpl(int radius) {
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
	public void setSize(int size) {
		this.radius = size;
		
	}


	
	

}
