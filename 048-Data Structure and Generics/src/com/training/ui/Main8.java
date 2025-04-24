package com.training.ui;

import com.training.ds.ObjectStack;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.Person;
import com.training.model.SalesEmployee;
import com.training.model.Square;

public class Main8 {
	public static void main(String[] args) {
		
		Integer obj1=Integer.valueOf(24);
		String obj2=new String("Welcome");
		Circle obj3=new Circle(14);
		Square obj4=new Square(100);
		BillItem obj5=new BillItem("Laptop", 12, 500000);
		
		ObjectStack stack=new ObjectStack(20);
		stack.push(obj1);
		stack.push(obj2);
		stack.push(obj3);
		stack.push(obj4);
		stack.push(obj5);
		System.out.println(stack);
		
		Employee emp=new Employee(101, "Renju", "Female", "Kochi", 20000);
		Manager manager=new Manager(102, "Anu", "Female", "EKM", 1000.00, 10);
		SalesEmployee sEmp=new SalesEmployee(103, "Anila", "Female", "EKM", 10000.00, 10);
		Account account=new Account("Ajantha", 500.00);
		Person person=new Person("Suma", 20);
		
		stack.push(emp);
		stack.push(manager);
		stack.push(sEmp);
		stack.push(account);
		stack.push(person);
		System.out.println(stack);
		
		System.out.println("-------------");
		Object r=stack.pop();
	
		if(r instanceof Integer) {
			Integer p=(Integer)r;
			System.out.println(p.intValue());
		}
		if(r instanceof String) {
			String p=(String)r;
			System.out.println(p.toLowerCase());
		}
		
		if(r instanceof Circle) {
			Circle p=(Circle)r;
			System.out.println(p.getArea());
		}
		if(r instanceof Square) {
			Square p=(Square)r;
			System.out.println(p.getArea());
		}
		if(r instanceof BillItem) {
			BillItem p=(BillItem)r;
			System.out.println(p.getItemName());
		}
		if(r instanceof Person) {
			Person p=(Person)r;
			System.out.println(p.getName());
		}
		if(r instanceof Account) {
			Account p=(Account)r;
			System.out.println(p.getBalance());
		}
		if(r instanceof Employee) {
			Employee p=(Employee)r;
			System.out.println(p.getName()+" , "+p.getBasic());
		}
		if(r instanceof Manager) {
			Manager p=(Manager)r;
			System.out.println(p.getName()+" , "+p.getEmployeeCount());
		}
		if(r instanceof SalesEmployee) {
			SalesEmployee p=(SalesEmployee)r;
			System.out.println(p.getName()+" , "+p.getSalesAmount());
		}
		System.out.println(r);
		
	}

}
