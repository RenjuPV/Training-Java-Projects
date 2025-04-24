package com.training.model;

public class NetSalaryCalculator {

	
	public double getNetSalary(Employee employee,TaxCalculator tax,AllowanceCalculator allowance) {
		
		return employee.getBasicSalary()+allowance.computeAllowance(employee)-tax.computeTax(employee);
	}
	
}
