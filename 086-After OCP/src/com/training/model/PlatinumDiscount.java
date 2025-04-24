package com.training.model;

public class PlatinumDiscount implements Discount {

	@Override
	public double calculateDisount(double amount) {
	
		return 0.30 * amount;
	}

}
