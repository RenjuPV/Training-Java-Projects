package com.training.ui;

import java.util.Comparator;


import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;

import com.training.model.comparators.EmployeeBasicSalaryAscendingComparator;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;

public class Main8 {

	private static int search(Employee[] arr, Employee searchData) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(searchData))
				return i;
		}
		return -1;
	}

	private static int idComparabeSearch(Employee[] arr, Employee searchObject) {

		for (int i = 0; i < arr.length; i++) {

			if (searchObject instanceof Comparable) {

				Comparable searchData = searchObject;
				int r = arr[i].compareTo(searchData);
				if (r == 0)
					return i;

			}
		}
		return -1;
	}

	private static int basicSalaryAscendingSearch(Employee[] arr, Employee searchObject) {

		Comparator comparator = new EmployeeBasicSalaryAscendingComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

		}
		return -1;
	}
	
	private static int basicSalaryDescendingSearch(Employee[] arr, Employee searchObject) {

		Comparator comparator = new EmployeeBasicSalaryDescendingComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sanju", "female", "tvm", 30000.0);
		Employee emp2 = new Employee(102, "Manju", "female", "tvm", 15000.0);
		SalesEmployee se1 = new SalesEmployee(103, "Anila", "female", "tvm", 35000.0, 100000);
		SalesEmployee se2 = new SalesEmployee(104, "Anju", "female", "tvm", 20000.0, 100000);
		Manager m = new Manager(104, "Renju", "Female", "tvm", 10000.0, 10);
		Employee[] employees = { emp1, emp2, se1, se2, m };

		Employee searchObject = new Employee(101, "Sanju", "female", "tvm", 33000.0);

		int searchResult = search(employees, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search id " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search id " + searchObject + " is present at position : " + searchResult);

		System.out.println("-------------------------------------------");
		
		

		int idComparabeSearchResult = idComparabeSearch(employees, searchObject);
		if (idComparabeSearchResult == -1)
			System.out.println("The search id " + searchObject + " is not present and search result is : "
					+ idComparabeSearchResult);
		else
			System.out.println(
					"The search id " + searchObject + " is present at position : " + idComparabeSearchResult);

		System.out.println("-------------------------------------------");

		int basicSalarySearchResult = basicSalaryAscendingSearch(employees, searchObject);
		if (basicSalarySearchResult == -1)
			System.out.println("The search salary " + searchObject + " is not present and search result is : "
					+ basicSalarySearchResult);
		else
			System.out.println(
					"The search salary " + searchObject + " is present at position : " + basicSalarySearchResult);
		
		
		int basicSalaryDescendingSearchResult = basicSalaryDescendingSearch(employees, searchObject);
		if (basicSalaryDescendingSearchResult == -1)
			System.out.println("The search salary " + searchObject + " is not present and search result is : "
					+ basicSalaryDescendingSearchResult);
		else
			System.out.println(
					"The search salary " + searchObject + " is present at position : " + basicSalaryDescendingSearchResult);
	}
	}


