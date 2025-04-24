package com.training.ui;

import com.training.dp.Account;
import com.training.dp.AccountCreator;
import com.training.dp.ConcreateCountyAccountCreator;
import com.training.dp.CountryAccountCreator;

public class Main1 {

	public static void main(String[] args) {

		CountryAccountCreator countryAccountCreator;
		countryAccountCreator = new ConcreateCountyAccountCreator();

		System.out.println("USA Account Details");
		System.out.println("------------------------------");
		AccountCreator accountCreator = countryAccountCreator.create("USA");

		Account account = accountCreator.createAccount(1);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(2);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(3);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		System.out.println("--------------------------------");

		System.out.println("Indian Account Details");
		System.out.println("------------------------------");
		accountCreator = countryAccountCreator.create("India");
		account = accountCreator.createAccount(1);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(2);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(3);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		System.out.println("--------------------------------");

		System.out.println("Uk Account Details");
		System.out.println("------------------------------");
		accountCreator = countryAccountCreator.create("Uk");
		account = accountCreator.createAccount(1);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(2);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(3);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		System.out.println("--------------------------------");

		System.out.println("Chinease Account Details");
		System.out.println("------------------------------");
		accountCreator = countryAccountCreator.create("China");
		account = accountCreator.createAccount(1);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(2);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		account = accountCreator.createAccount(3);
		account.deposit(100);
		account.withdraw(50);
		System.out.println(account);
		System.out.println("--------------------------------");

	}

}
