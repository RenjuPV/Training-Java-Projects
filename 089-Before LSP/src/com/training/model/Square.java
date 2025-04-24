package com.training.model;

public class Square extends Rectangle{
	
	@Override
	public void setWidth(int width) {
		
		this.height=width;
		this.width=width;
	}
	
	@Override
	public void setHeight(int height) {
		
		this.height=height;
		this.width=height;
		
	}

}
