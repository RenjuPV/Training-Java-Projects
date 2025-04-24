package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Employee;

public class EmployeeTesting {

	Employee employee;

	@BeforeEach
	public void init() {
		employee = new Employee();
	}

	@AfterEach
	public void clean() {
		employee = null;
	}

	@Test
	@DisplayName("Testing Positive Value for Setting BasicSalary")
	public void testBasicSalaryForPositiveData() {
		try {
			employee.setBasicSalary(1000.00);
			double expected = 1000.00;
			double actual = employee.getBasicSalary();
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Testing Negative Value for Setting BasicSalary")
	public void testBasicSalaryForNegativeData() {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setBasicSalary(-1000.00);
		});
		String expectedMessage = "Negative Salary Not Acceptable";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}

	@Test
	@DisplayName("Testing Positive Test Value for Name")
	public void testNameForPositiveTestData() {
		try {
			employee.setName("Renju");
			String expected = "Renju";
			String actual = employee.getName();
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Testing Blank Test Value for Name")
	public void testNameForNegativeTestData() {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setName("");
		});
		String expectedMessage = "Invalid value for name";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}

	@Test
	@DisplayName("Testing Null Test Value for Name")
	public void testNameForNullTestData() {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setName(null);
		});
		String expectedMessage = "Invalid value for name";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}