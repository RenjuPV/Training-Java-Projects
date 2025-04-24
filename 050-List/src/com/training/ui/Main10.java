package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Account;

public class Main10 {
	
	public static void main(String[] args) {
		
		List<Account> accounts=new LinkedList<>();
		
		accounts.add(new Account("Ram", 1000.00));
		accounts.add(new Account("Mamtha", 2000.00));
		accounts.add(new Account("Dinesh", 3000.00));
		accounts.add(new Account("Kiran", 4000.00));
		
		System.out.println(accounts.contains(new Account("Mamtha",0)));
		
	}

}
