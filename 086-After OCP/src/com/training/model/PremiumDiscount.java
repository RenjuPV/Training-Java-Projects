package com.training.model;

public class PremiumDiscount implements Discount{

	@Override
	public double calculateDisount(double amount) {
		return  0.20 * amount;
	}

}
