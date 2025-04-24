package com.training.model;

public class TaxCalculator {
	
	public double computeTax(Employee employee) {
		double tax=0;
		if(employee.getGrade()=='A')
			tax=employee.getBasicSalary()*0.28;
		if(employee.getGrade()=='B')
			tax=employee.getBasicSalary()*0.20;
		if(employee.getGrade()=='C')
			tax=employee.getBasicSalary()*0.10;
		return tax;
	}

}
