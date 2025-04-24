package com.training.model;

public class Square implements Shape{
	int size;
	

	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}

	public int getSize() {
		return size;
	}

	@Override
	public void setSize(int size) {
		this.size=size;
		
	}

	@Override
	public double getArea() {
		
		return this.size*this.size;
	}

}
