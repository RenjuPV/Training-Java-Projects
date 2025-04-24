package com.training.ui;

import com.training.model.Account;
import com.training.model.AccountFactory;

public class Main1 {

	public static void main(String[] args) {

		AccountFactory accountFactory = new AccountFactory();

		Account account = accountFactory.createAccount("Savings");
		account.setBalance(100.00);
		account.deposit(500);
		account.withdraw(200);
		System.out.println(account);
		System.out.println("--------------------------------");

		account = accountFactory.createAccount("Current");
		account.setBalance(200.00);
		account.deposit(500);
		account.withdraw(200);
		System.out.println(account);
		System.out.println("--------------------------------");

		account = accountFactory.createAccount("Fixed");
		account.setBalance(300.00);
		account.deposit(500);
		account.withdraw(200);
		System.out.println(account);
		System.out.println("--------------------------------");

	}

}
