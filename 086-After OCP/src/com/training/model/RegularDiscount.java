package com.training.model;

public class RegularDiscount implements Discount{

	@Override
	public double calculateDisount(double amount) {
		return 0.10 * amount;
		
	}

}
