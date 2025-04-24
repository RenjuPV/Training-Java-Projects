package com.training.dp.model;

public class NegativeNumberCheckingCalculator implements Calculator {
	Calculator calculator;

	public NegativeNumberCheckingCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public int add(int a, int b) {

		if (this.calculator == null)
			return 0;
		else {
			if (a < 0 || b < 0) {
				System.out.println("Negative number");
				return 0;
			} else {
				int r = this.calculator.add(a, b);
				return r;
			}

		}
	}

}
