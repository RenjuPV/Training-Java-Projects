package com.training.model;

public class AllowanceComputation {
	
	public double computeAllowance(Allowance allowance,double basicSalary) {
		
		return allowance.calculate(basicSalary);
	}

}
