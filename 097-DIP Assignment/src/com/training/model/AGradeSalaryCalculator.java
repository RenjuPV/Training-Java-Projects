package com.training.model;

public class AGradeSalaryCalculator implements GradewiseCalculator {
	
	public double calculateSalary(double basic) {
		return basic*0.35;
	}

}
