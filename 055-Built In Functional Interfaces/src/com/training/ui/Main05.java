package com.training.ui;

import java.util.function.Function;

import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Payment;
import com.training.model.Square;

public class Main05 {
	
	public static void main(String[] args) {
		
		Function<Integer, Circle>function1;
		function1=(Integer i)->{
			return new Circle(i.intValue());
		};
		
		Circle c=function1.apply(5);
		System.out.println(c);
		
		
		Function<Integer, Square>function2;
		function2=i->new Square(i.intValue());
		Square s=function2.apply(6);
		System.out.println(s);
		
		Function<Employee,String>function3;
		function3=e->e.getName();
		
		
		Function<Employee,String>function4;
		function4=e->e.getCityName();
		
		
		Function<Employee,Double>function5;
		function5=e->e.getBasic();
		
		
		Employee e=new Employee(101, "Renju", "Female", "Kochi", 1000.00);
	
	
		String ename=function3.apply(e);
		System.out.println(ename);
		
		
		String eCity=function4.apply(e);
		System.out.println(eCity);
		
		
		Double eBasic=function5.apply(e);
		System.out.println(eBasic);
		
	
		Payment payment=new Payment("March", 2500.00);
		
		Function<Payment, Double>function6;
		function6=(p)->p.getPaymentAmount();
		
		Function<Payment, String>function7;
		function7=(p)->p.getMonth();
		
		Double pAmount=function6.apply(payment);
		System.out.println("Payment Amount : "+pAmount);
		
		String pMonth=function7.apply(payment);
		System.out.println("Month : "+pMonth);
		
		
		
	} 

}
