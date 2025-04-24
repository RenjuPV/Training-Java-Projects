package com.training.ui;

import com.training.model.DiscountCalculator;

public class Main1 {
	
	public static void main(String[] args) {
		
		DiscountCalculator discountCalculator=new DiscountCalculator();
		
		double discountForRegular=discountCalculator.calculateDiscount("Regular", 100);
		double discountForPremium=discountCalculator.calculateDiscount("Premium", 100);
		double discountForPlatinum=discountCalculator.calculateDiscount("Platinum", 100);
		
		System.out.println(discountForRegular);
		System.out.println(discountForPremium);
		System.out.println(discountForPlatinum);
		
	}

}
