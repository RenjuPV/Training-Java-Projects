package com.training.ui;

import java.util.function.Supplier;

import com.training.model.Bill;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Department;
import com.training.model.Employee;

public class Main04 {
	
	public static void main(String[] args) {
		
		Supplier<Circle>supplier1;
		supplier1=()->new Circle(10);
		System.out.println(supplier1.get());
		
		Supplier<BillItem>supplier2;
		supplier2=()->new BillItem("Dell", 2, 35000.0);
		System.out.println(supplier2.get());
		
		Supplier<Employee>supplier3;
		supplier3=()->new Employee(101,"Renju", "Female", "Kochi",35000.0);
		System.out.println(supplier3.get());
		
		
		Supplier<Bill>supplier4;
		supplier4=()->{
			Bill bill=new Bill(554,"Abhi");
			bill.addBillItem("IPhone", 2, 35000.00);
			bill.addBillItem("Dell", 2, 35000.00);
			return bill;
		};
		Bill latestBill=supplier4.get();
		latestBill.printBill();
		
		Supplier<Department>supplier5;
		supplier5=()->{
			Department department = new Department("IT", "Kiran");
			department.addEmployee(101, "Anju", "Female", "Kottayam", 10000.0);
			department.addEmployee(102, "Renju", "Female", "Kochi", 20000.0);
			department.addEmployee(103, "Manju", "Female", "Mumbai", 30000.0);
			department.addEmployee(104, "Sanju", "Male", "Chennai", 40000.0);
			return department;
		};
		Department  deptDetails=supplier5.get();
		deptDetails.printReport();
		
		
		
		
	}

}
