package com.training.ui;

import java.util.Collection;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.model.Employee;

@Controller
@RequestMapping(value="employees")
public class EmployeeController {
	
	@GetMapping(value = "/display")
	public String f1(Model model) {
		Employee  employee= new Employee(101, "Renju", 10000, "Female");
		model.addAttribute("emp", employee);
		return "EmployeeDisplay";
	}

	@GetMapping(value = "/listing")
	public String f2(Model model) {
		Employee  employee1= new Employee(101, "Renju", 10000, "Female");
		Employee  employee2= new Employee(102, "Anju", 15000, "Female");
		Employee  employee3= new Employee(103, "Manju", 20000, "Female");
		Employee  employee4= new Employee(104, "Sanju", 30000, "Female");
		Employee  employee5= new Employee(105, "Chinju", 40000, "Female");

		Collection<Employee> employees = new LinkedList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		model.addAttribute("emps", employees);
		return "EmployeesListing";

	}


}
