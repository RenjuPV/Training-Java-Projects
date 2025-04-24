package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Account;
import com.training.model.Person;

public class Main12 {
public static void main(String[] args) {
		
		try {
		Stack<Person> stack1 = new StackImpl<>(20);
		stack1.push(new Person("Anju", 10));
		stack1.push(new Person("Renju", 34));
		stack1.push(new Person("Manju", 25));
		stack1.push(new Person("Sanju", 15));
		stack1.push(new Person("Nimmi", 25));

		System.out.println(stack1);
		
		Person r = stack1.pop();
		System.out.println(r);
		System.out.println(r.getName() + " , " + r.getAge());
		System.out.println(stack1);
		
		Person r2 = stack1.pop();
		System.out.println(r2);
		System.out.println(r2.getName() + " , " + r2.getAge());
		System.out.println(stack1);
		}catch (Throwable e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
