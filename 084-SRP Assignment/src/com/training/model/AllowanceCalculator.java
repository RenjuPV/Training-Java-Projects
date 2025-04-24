package com.training.model;

public class AllowanceCalculator {

	public double computeAllowance(Employee employee) {
		double allowance = 0;
		if (employee.getGrade() == 'A')
			allowance = employee.getBasicSalary() * 0.35;
		if (employee.getGrade() == 'B')
			allowance = employee.getBasicSalary() * 0.25;
		if (employee.getGrade() == 'C')
			allowance = employee.getBasicSalary() * 0.20;
		return allowance;
	}

}
