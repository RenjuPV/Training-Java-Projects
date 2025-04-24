package com.training.ui;

import com.training.model.pack3.Circle;
import com.training.model.pack3.Employee;
import com.training.model.pack3.Factory;

public class Main03 {
	
	public static void main(String[] args) {
		
		Factory<Circle> factory;
		factory=(r)->new Circle(r);
		Circle c=factory.create(10);
		System.out.println(c);
		
		
		factory=Circle::new;//constructor reference
		Circle c1=factory.create(100);
		System.out.println(c1);
		
	
		
		Factory<Employee> factory1;
		factory1=(i)->new Employee(i);
		Employee e=factory1.create(1601);
		System.out.println(e);
		
		factory1=Employee::new;///constructor reference
		Employee e1=factory1.create(1602);
		System.out.println(e1);
		
		
		
	}

}
