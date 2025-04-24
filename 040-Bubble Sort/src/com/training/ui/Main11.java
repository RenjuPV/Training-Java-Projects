package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.AccountNameComparator;
import com.training.model.comparators.EmployeeBasicSalaryAscendingComparator;

public class Main11 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sanju", "female", "tvm", 30000.0);
		Employee emp2 = new Employee(102, "Manju", "female", "tvm", 15000.0);
		SalesEmployee se1 = new SalesEmployee(103, "Anila", "female", "tvm", 35000.0, 100000);
		SalesEmployee se2 = new SalesEmployee(104, "Anju", "female", "tvm", 20000.0, 100000);
		Manager m = new Manager(104, "Renju", "Female", "tvm", 10000.0, 10);

		Employee[] employees = { emp1, emp2, se1, se2, m };

		for (int i = 0; i < employees.length; i++) {

			for (int j = 0; j < employees.length - i - 1; j++) {

				EmployeeBasicSalaryAscendingComparator comparator = new EmployeeBasicSalaryAscendingComparator();

				int r = comparator.compare(employees[j], employees[j + 1]);

				if (r > 0) {
					Employee temp;
					temp = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(employees));
		employees = null;

	}
}
