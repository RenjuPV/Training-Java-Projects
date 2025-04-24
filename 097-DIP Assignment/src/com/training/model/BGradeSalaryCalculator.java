package com.training.model;

public class BGradeSalaryCalculator implements GradewiseCalculator{

	@Override
	public double calculateSalary(double basic) {
		
		return basic*0.25;
	}

}
