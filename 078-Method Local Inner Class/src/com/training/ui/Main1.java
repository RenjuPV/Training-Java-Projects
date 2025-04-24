package com.training.ui;

import com.training.model.Employee;

public class Main1 {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.basicSalary=1000.00;
		System.out.println(employee.computeAllowance());
		
	}

}
