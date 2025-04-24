package com.training.model;

public class BGradeDeduction implements Deduction {

	@Override
	public double computeDeduction(double basicSalary) {
		return 0.25 * basicSalary;
	}

}
