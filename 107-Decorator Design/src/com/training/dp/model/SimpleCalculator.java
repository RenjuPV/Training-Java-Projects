package com.training.dp.model;

public class SimpleCalculator implements Calculator {

	Calculator calculator;

	public SimpleCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public int add(int a, int b) {
		if (this.calculator == null)
			return a + b;
		else {

			this.calculator.add(a, b);//
			int r=a+b;
			return r;
		}

	}

}
