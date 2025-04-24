package com.training.model;

import java.util.Objects;

public class Square {
	int size;
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Square(int size) {
		super();
		this.size = size;
	}

	public Square() {
		super();
	}
	
	public double getArea() {
		return this.size*this.size;
	}

	

	@Override
	public String toString() {
		return "\nSquare [size=" + size + ", getArea()=" + getArea() + "]";
	}

	

	


}
