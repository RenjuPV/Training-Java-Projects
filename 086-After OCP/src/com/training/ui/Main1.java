package com.training.ui;

import com.training.model.DiscountCalculator;
import com.training.model.GoldenDiscount;
import com.training.model.PlatinumDiscount;
import com.training.model.PremiumDiscount;
import com.training.model.RegularDiscount;

public class Main1 {
	
	public static void main(String[] args) {
		
		DiscountCalculator discountCalculator=new DiscountCalculator();
		
		double discountForRegular=discountCalculator.calculateDiscount(new RegularDiscount(), 100);
		double discountForPremium=discountCalculator.calculateDiscount(new PlatinumDiscount(), 100);
		double discountForPlatinum=discountCalculator.calculateDiscount(new PremiumDiscount(), 100);
		double discountForGolden=discountCalculator.calculateDiscount(new GoldenDiscount(), 100);
		
		System.out.println(discountForRegular);
		System.out.println(discountForPremium);
		System.out.println(discountForPlatinum);
		System.out.println(discountForGolden);
		
	}

}
