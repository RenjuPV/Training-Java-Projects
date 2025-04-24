package com.training.model;

public class CGradeAllowance implements Allowance{

	@Override
	public double calculate(double basicSalary) {
		return 0.15 * basicSalary;
	}

}
