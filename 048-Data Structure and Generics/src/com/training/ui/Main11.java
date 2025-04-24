package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;

public class Main11 {
	public static void main(String[] args) {

		try {
			Stack<Account> stack1 = new StackImpl<>(20);

			stack1.push(new Account("Anju", 10));
			stack1.push(new Account("Renju", 35));
			stack1.push(new Account("Manju", 25));
			stack1.push(new Account("Sanju", 15));
			stack1.push(new Account("Nimmi", 25));

			System.out.println(stack1);

			Account r = stack1.pop();
			System.out.println(r);
			System.out.println(r.getCustomerName() + " , " + r.getBalance());
			System.out.println(stack1);

			Account r2 = stack1.pop();
			System.out.println(r2);
			System.out.println(r2.getCustomerName() + " , " + r2.getBalance());
			System.out.println(stack1);

		} catch (Throwable e) {
			System.err.println(e.getMessage());
		}

	}

}
