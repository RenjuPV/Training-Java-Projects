package com.training.model;

public class CGradeDeduction implements Deduction {

	@Override
	public double computeDeduction(double basicSalary) {
		return 0.15 * basicSalary;
	}

}
