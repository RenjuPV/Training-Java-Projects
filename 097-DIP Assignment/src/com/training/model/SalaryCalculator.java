package com.training.model;

public class SalaryCalculator {
	
	GradewiseCalculator calculator;
	
	public SalaryCalculator(GradewiseCalculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public void printSalary(double basic) {
		System.out.println(this.calculator.calculateSalary(basic));
	}

	

}
