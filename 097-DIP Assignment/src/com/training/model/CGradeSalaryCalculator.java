package com.training.model;

public class CGradeSalaryCalculator implements GradewiseCalculator{

	@Override
	public double calculateSalary(double basic) {
		
		return basic*0.15;
	}

}
