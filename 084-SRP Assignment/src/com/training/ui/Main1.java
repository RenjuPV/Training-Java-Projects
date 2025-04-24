package com.training.ui;

import java.io.IOException;

import com.training.model.AllowanceCalculator;
import com.training.model.Employee;
import com.training.model.NetSalaryCalculator;
import com.training.model.TaxCalculator;

public class Main1 {

	public static void main(String[] args) {
		
		Employee emp=new Employee(101, "Renju", 10000.00, 'A');
		
		AllowanceCalculator allowanceCalculator=new AllowanceCalculator();
		double allowance=allowanceCalculator.computeAllowance(emp);
		
		TaxCalculator taxCalculator=new TaxCalculator();
		double tax=taxCalculator.computeTax(emp);
		
		NetSalaryCalculator netSalaryCalculator=new NetSalaryCalculator();
		double netSal=netSalaryCalculator.getNetSalary(emp, taxCalculator, allowanceCalculator);
		
		System.out.println(emp);
		System.out.println("Allowance : "+allowance);
		System.out.println("Tax : "+tax);
		System.out.println("Net Salary : "+netSal);

	}

}
