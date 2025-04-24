package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.model.Employee;

public class Main13 {
	
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
		
		List<Employee>maleEmployees=allEmployees
			.stream()
			.sorted()
			.filter(e->e.getGender().equalsIgnoreCase("Male"))
			.collect(Collectors.toList());
		System.out.println(maleEmployees);
		
		
		System.out.println("----------------------------------\n");
		
		List<String>empNameList=allEmployees
				.stream()
				.map(e->e.getName())
				.sorted()
				.collect(Collectors.toList());
			System.out.println(empNameList);
			
			
			System.out.println("----------------------------------\n");
			
			List<Double>allBasicSalary=allEmployees
					.stream()
					.map(e->e.getBasic())
					.sorted()
					.collect(Collectors.toList());
				System.out.println(allBasicSalary);
				
				System.out.println("----------------------------------\n");
				
				List<String>allCities=allEmployees
						.stream()
						.map(e->e.getCityName())
						.distinct()
						.collect(Collectors.toList());
					System.out.println(allCities);	
					
			
			
			double totalSalary=allEmployees
						.stream()
						.collect(Collectors.summingDouble(e->e.getBasic()));
			System.out.println("Total salary: "+totalSalary);
			
			double totalSalary1=allEmployees
					.stream()
					.collect(Collectors.summingDouble(Employee::getBasic));
		    System.out.println("Total salary: "+totalSalary1);
			
			
			
			
			String result=allEmployees
						.stream()
						.map(e->e.toString())
						.collect(Collectors.joining(","));
			System.out.println(result);
			
			String result1=allEmployees
					.stream()
					.map(Employee::toString)
					.collect(Collectors.joining(","));
		   System.out.println(result1);
		   
		   
		   
		   
		   
		   
		   
		   Map<String,List<Employee>>map1=allEmployees
				   .stream()
				   .collect(Collectors.groupingBy(Employee::getCityName));
		   
		   for(Map.Entry<String, List<Employee>> entry:map1.entrySet()) {
			   System.out.println(entry.getKey());
			   System.out.println("---------------------");
			   List<Employee>empsInCity=entry.getValue();
			   for(Employee e:empsInCity) {
				   System.out.println(e.toString());
			   }
			   
		   }
		   
		   Map<String,Long>map2=allEmployees
				   .stream()
				   .collect(Collectors.groupingBy(Employee::getCityName, Collectors.counting()));
		   System.out.println(map2);
		   
		   
		   Map<String,Double>map3=allEmployees
				   .stream()
				   .collect(Collectors.groupingBy(Employee::getCityName, Collectors.summingDouble(Employee::getBasic)));
		   System.out.println(map3);
		   
		   
		   Map<Integer,String>map4=allEmployees
				   .stream()
				   .collect(Collectors.toMap(Employee::getId, Employee::getName));
		   System.out.println(map4);
		   
		   allEmployees
				   .stream()
				   .forEach(System.out::println);
		   
		   
		   
		   
		
		
	}

}
