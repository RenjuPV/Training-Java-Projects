package com.training.model;

public class AGradeAllowance implements Allowance {

	@Override
	public double calculate(double basicSalary) {

		return 0.35 * basicSalary;
	}

}
