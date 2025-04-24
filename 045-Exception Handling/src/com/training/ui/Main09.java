package com.training.ui;

import com.training.model.Employee;

public class Main09 {
	public static void main(String[] args) throws Exception {
		
		//System.out.println(100 / 0);
		
		Employee emp=new Employee();
		
		emp.setBasicSalary(-10000.00);
		
		System.out.println(emp.computeAllowance());
		
	}

}
