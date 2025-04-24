package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Account;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.AccountNameComparator;
import com.training.model.comparators.EmployeeBasicSalaryAscendingComparator;

public class Main11 {
	public static int search(Employee[] arr, Employee searchData) {

		Comparator comparator = new EmployeeBasicSalaryAscendingComparator();

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			int r = comparator.compare(arr[mid], searchData);
			if (r == 0)
				return mid;
			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
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

		Employee searchemployeesObject = new Employee(101, "Sanju", "female", "tvm", 33000.0);

		Arrays.sort(employees, new EmployeeBasicSalaryAscendingComparator());

		System.out.println(Arrays.toString(employees));

		int searchResult = search(employees, searchemployeesObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchemployeesObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchemployeesObject + " is present at position : " + searchResult);
	}

}
