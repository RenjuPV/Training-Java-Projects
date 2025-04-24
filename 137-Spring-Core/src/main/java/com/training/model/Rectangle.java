package com.training.model;

public class Rectangle implements Shape {

	int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public void setSize(int size) {
		this.width = size;
		this.height = size * 2;

	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}
}
