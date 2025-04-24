package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Employee;

public class Main06 {
	
	public static void main(String[] args) {
		
		Acceptor<Circle>acceptor1;
		acceptor1=c->System.out.println(c.getRadius()+","+c.getArea());
		acceptor1.accept(new Circle(10));
		
		Acceptor<Account>acceptor2;
		acceptor2=a->System.out.println(a.getCustomerName().toUpperCase()+","+a.getBalance());
		acceptor2.accept(new Account("Anju",1000.00));
		
		
		Acceptor<BillItem>acceptor3;
		acceptor3=bill->System.out.println(bill.toString());
		acceptor3.accept(new BillItem("Laptop",2,100000.00));
		
		Acceptor<Employee>acceptor4;
		acceptor4=emp->System.out.println("Name : "+emp.getName()+" :: City Name : "+emp.getCityName().toUpperCase()+" :: Gender : "+emp.getGender().toUpperCase()+" :: Net Salary :"+emp.netSalary());
		acceptor4.accept(new Employee(101, "Renju", "Female", "Cochi", 15000.00));
		
		
		
		
	}

}
