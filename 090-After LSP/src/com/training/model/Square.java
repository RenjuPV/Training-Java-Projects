package com.training.model;

public class Square implements Shape{
	private int side;
	
	

	public Square(int side) {
		super();
		this.side = side;
	}



	public int getSide() {
		return side;
	}



	public void setSide(int side) {
		this.side = side;
	}



	@Override
	public int getArea() {
		
		return this.side*this.side;
	}

}
