package com.training.ui;

import com.training.model.AGradeSalaryCalculator;
import com.training.model.BGradeSalaryCalculator;
import com.training.model.CGradeSalaryCalculator;
import com.training.model.GradewiseCalculator;
import com.training.model.SalaryCalculator;

public class Main1 {
	
	public static void main(String[] args) {
		
		
		System.out.println("A Grade Salary Calculator");
		GradewiseCalculator gradeCalculator=new AGradeSalaryCalculator();
		SalaryCalculator calculator=new SalaryCalculator(gradeCalculator);
		calculator.printSalary(10000.00);
		
		System.out.println("B Grade Salary Calculator");
		gradeCalculator=new BGradeSalaryCalculator();
		calculator=new SalaryCalculator(gradeCalculator);
		calculator.printSalary(10000.00);
		
		System.out.println("C Grade Salary Calculator");
		gradeCalculator=new CGradeSalaryCalculator();
		calculator=new SalaryCalculator(gradeCalculator);
		calculator.printSalary(10000.00);
		
		
	}

}
