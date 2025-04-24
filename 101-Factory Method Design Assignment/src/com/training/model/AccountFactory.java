package com.training.model;

public class AccountFactory {
	
	public Account createAccount(String accountType) {

		Account account = null;
		if (accountType.equalsIgnoreCase("Savings"))
			account = new SavingsAccount();
		if (accountType.equalsIgnoreCase("Current"))
			account = new CurrentAccount();
		if (accountType.equalsIgnoreCase("Fixed"))
			account = new FixedDepositAccount();
		return account;

	}

}
