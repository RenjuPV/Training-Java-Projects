package com.traing.model;

public class J extends I{
	
	@Override
	public Vehicle create() {
		return new Car();
	}
	

}
