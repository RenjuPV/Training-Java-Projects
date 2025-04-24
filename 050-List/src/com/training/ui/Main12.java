package com.training.ui;

import com.training.model.Department;

public class Main12 {

	public static void main(String[] args) {
		
		Department department=new Department("IT", "Leela");
		department.addEmployee(101, "Deepa", "Female", "Mumbai", 1000.00);
		department.addEmployee(102, "Sree", "Female", "Cochin", 2000.00);
		department.addEmployee(103, "Kiran", "Male", "Bnglr", 3000.00);
		department.addEmployee(104, "Mamta", "Female", "Hydrbd", 4000.00);
		
		//System.out.println(department.isPresent(102));
		//System.out.println(department.findByEmployeeId(102));
		department.printReport();
		department.updateEmployee(102, "Sree Hari", "Male", "COC", 25000);
		department.printReport();
		department.deleteEmployee(103);
		department.printReport();
		
		
		

	}
}
