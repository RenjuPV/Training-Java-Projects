package com.training.ui;

import com.training.dp.model.Calculator;
import com.training.dp.model.MessageCalculator;
import com.training.dp.model.NegativeNumberCheckingCalculator;
import com.training.dp.model.SimpleCalculator;

public class Main2 {
	
	public static void main(String[] args) {
		
		Calculator calculator=new SimpleCalculator(null);
		System.out.println(calculator.add(10, 5));
		
		NegativeNumberCheckingCalculator nc=new NegativeNumberCheckingCalculator(calculator);
		System.out.println(nc.add(10, -5));
		
		MessageCalculator mc=new MessageCalculator(calculator);
		System.out.println(mc.add(10, -5));
		
	}
	

}
