package com.training.ui;

import com.training.model.Account;
import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Tester;

public class Main08 {

	public static void main(String[] args) {

		Tester<Circle> tester1;
		tester1 = c -> c.getArea() > 100;
		System.out.println(tester1.test(new Circle(10)));

		Tester<Account> tester2;
		tester2 = a -> a.getBalance() > 10000.00;
		System.out.println(tester2.test(new Account("Renju", 5000.00)));

		Tester<Employee> tester3;
		tester3 = emp -> emp.getCityName().equalsIgnoreCase("Mumbai");
		System.out.println(tester3.test(new Employee(101, "Renju", "Female", "Kochi", 15000.00)));

		Tester<Employee> tester4;
		tester4 = emp -> emp.getGender().equalsIgnoreCase("Female");
		System.out.println(tester4.test(new Employee(101, "Renju", "Female", "Kochi", 15000.00)));

		Tester<Employee> tester5;
		tester5 = emp -> emp.netSalary() > 50000.00;
		System.out.println(tester5.test(new Employee(101, "Renju", "Female", "Kochi", 55000.00)));

	}

}
