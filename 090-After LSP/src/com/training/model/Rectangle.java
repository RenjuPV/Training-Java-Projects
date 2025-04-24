package com.training.model;

public class Rectangle implements Shape {
	int height;
	int width;

	
	
	public Rectangle() {
		super();
	}



	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	@Override
	public int getArea() {
		
		return this.height*this.width;
	}
	

}
