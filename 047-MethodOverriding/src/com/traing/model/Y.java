package com.traing.model;

public class Y implements X{

	@Override
	public void print(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test(double x) throws Exception {
		if(x<0) {
			Exception e = new Exception("Invalid Value");

			throw e;

		}
		
		
	}

}
