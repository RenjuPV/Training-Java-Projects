package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;

public class Main04 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Ram", "Male", "Chennai", 10000.00);
		Employee e2 = new Employee(11, "Saranya", "Female", "Chennai", 20000.00);
		Employee e3 = new Employee(12, "Lakshmi", "Female", "BNGLR", 3000.00);
		Employee e4 = new Employee(13, "Vicky", "Male", "COC", 4000.00);
		Employee e5 = new Employee(14, "Reshmi", "Female", "Chennai", 5000.00);
		Employee e6 = new Employee(15, "Kiran", "Male", "COC", 1000.00);
		Employee e7 = new Employee(16, "Saradha", "Female", "Chennai", 2000.00);
		Employee e8 = new Employee(17, "Vinodh", "Male", "BNGLR", 3000.00);
		Employee e9 = new Employee(18, "Sree", "Female", "COC", 4000.00);
		Employee e10 = new Employee(19, "Suresh", "Male", "BNGLR", 25000.00);

		List<Employee> allEmployees = new LinkedList<>();
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		allEmployees.add(e5);
		allEmployees.add(e6);
		allEmployees.add(e7);
		allEmployees.add(e8);
		allEmployees.add(e9);
		allEmployees.add(e10);
		
		allEmployees
			.stream()
			.map(e->e.getBasic())
			.forEach(e->System.out.println(e));
		
		System.out.println("------------------------------------");
		
		allEmployees
			.stream()
			.map(e->e.getCityName().toUpperCase())
			.forEach(e->System.out.println(e));
		
     System.out.println("------------------------------------");
		
		allEmployees
			.stream()
			.map(e->e.getGender())
			.forEach(g->System.out.println(g));
		
		 System.out.println("------------------------------------");
		 
			allEmployees
			.stream()
			.mapToDouble(e->e.netSalary())
			.forEach(s->System.out.println(s));
		
	}

}
