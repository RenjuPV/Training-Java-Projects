package com.training.model;

 class SquareImpl implements Shape{
	private int size;

	public SquareImpl(int size) {
		super();
		this.size = size;
	}

	public SquareImpl() {
		super();
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
