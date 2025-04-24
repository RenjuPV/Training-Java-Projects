package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.Person;
import com.training.model.SalesEmployee;

public class Main13 {

	public static void main(String[] args) throws Throwable  {
		try {
		Stack<Employee> stack1 = new StackImpl<>(20);
		stack1.push(new Employee(01, "Renju", "Female", "COC", 10000.00));
		stack1.push(new Manager(01, "Anju", "Female", "COC", 10000.00,10));
		stack1.push(new SalesEmployee(01, "Sanju", "Female", "COC", 10000.00,10000000.00));
		

		System.out.println(stack1);
		
		Employee r = stack1.pop();
		System.out.println(r);
		System.out.println(r.getId()+","+r.getName() + " , " + r.getBasic()+", "+r.getCityName()+","+r.getGender()+","+r.netSalary());
		System.out.println(stack1);
		
		Employee r1 = stack1.pop();
		System.out.println(r1);
		System.out.println(r1.getId()+","+r1.getName() + " , " + r1.getBasic()+", "+r1.getCityName()+","+r1.getGender()+","+r1.netSalary());
		System.out.println(stack1);
		
		Employee r2 = stack1.pop();
		System.out.println(r2);
		System.out.println(r2.getId()+","+r2.getName() + " , " + r2.getBasic()+", "+r2.getCityName()+","+r2.getGender()+","+r2.netSalary());
		System.out.println(stack1);
		
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	}

}
