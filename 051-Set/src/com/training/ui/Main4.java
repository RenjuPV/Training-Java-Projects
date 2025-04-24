package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.model.Account;

public class Main4 {
	public static void main(String[] args) {

		Set<Account> accSet = new HashSet<>();
		accSet.add(new Account("Ram", 1000.00));
		accSet.add(new Account("Dinesh", 1500.00));
		accSet.add(new Account("Reshmi", 2000.00));
		accSet.add(new Account("Mamtha", 4000.00));
		accSet.add(new Account("Ram", 5000.00));
		accSet.add(new Account("Kiran", 5000.00));

		System.out.println(accSet);

		Account searchAcc = new Account("Reshmi", 4000.00);
		System.out.println(accSet.contains(searchAcc));

		accSet.remove(new Account("Kiran", 10.00));
		System.out.println(accSet);

		double sum = 0.0;
		Iterator<Account> it = accSet.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			sum = sum + acc.getBalance();
		}
		System.out.println("Sum :" + sum);

	}

}
