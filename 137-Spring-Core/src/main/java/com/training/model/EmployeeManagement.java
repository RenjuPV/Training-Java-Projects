package com.training.model;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class EmployeeManagement {


		List<Employee>employees;
		
		public void initialize() {
			this.employees=new LinkedList<>();
			System.out.println("initalizing employees");
		}
		
		public void cleanUp() {
			this.employees.clear();
			System.out.println("Cleaning");
		}


}
