package com.trining.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.test.Employee;

public class EmployeeTesting {
	
	Employee employee;
	
	@BeforeEach
	public void setup() {
		employee=new Employee();
	}
	
	@AfterEach
	public void tear() {
		employee=null;
	}
	
	@Test
	@DisplayName("A grade Testing")
	public void employeeAGradeTesting() {
		employee.setGrade('A');
		int expected=40;
		int actual=this.employee.incentivePersentage();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("B grade Testing")
	public void employeeBGradeTesting() {
		employee.setGrade('B');
		int expected=30;
		int actual=this.employee.incentivePersentage();
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("C grade Testing")
	public void employeeCGradeTesting() {
		employee.setGrade('C');
		int expected=20;
		int actual=this.employee.incentivePersentage();
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("D grade Testing")
	public void employeeDGradeTesting() {
		employee.setGrade('D');
		int expected=10;
		int actual=this.employee.incentivePersentage();
		assertEquals(expected, actual);
	}
	

}
