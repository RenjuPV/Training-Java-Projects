package com.training.model;

public class DiscountCalculator {

	public double calculateDiscount(String customerType, double amt) {
		double discount = 0.0;
		if (customerType.equalsIgnoreCase("Regular")) {

			discount = 0.10 * amt;

		}
		if (customerType.equalsIgnoreCase("Premium")) {

			discount = 0.20 * amt;

		}
		if (customerType.equalsIgnoreCase("Platinum")) {

			discount = 0.30 * amt;

		}
		return discount;
	}

}
