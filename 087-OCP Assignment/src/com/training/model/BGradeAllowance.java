package com.training.model;

public class BGradeAllowance implements Allowance{

	@Override
	public double calculate(double basicSalary) {
		return 0.25 * basicSalary;
	}

}
