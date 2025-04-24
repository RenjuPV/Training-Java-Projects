package com.training.model;

public class GoldenDiscount implements Discount {

	@Override
	public double calculateDisount(double amount) {
		
		return 0.50*amount;
	}

}
