package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/fetchEmpList")
	public ResponseEntity<List<Employee>> f1(){
		
		Employee emp1= new Employee(101, "Renju P V", 50000.0);
		Employee emp2= new Employee(102, "Anju P V", 30000.0);
		Employee emp3= new Employee(103, "Rishan Renjith", 70000.0);
		Employee emp4= new Employee(104, "Renjith P N", 26000.0);
		Employee emp5= new Employee(105, "Arun Das", 45000.0);
		
		List<Employee> empList=new LinkedList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		return ResponseEntity.ok(empList);
		
	}

}
