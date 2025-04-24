package com.training.model.uk;

import com.training.dp.Account;

class FixedDepositAccount implements Account {

	double balance;

	FixedDepositAccount() {
		super();
	}

	FixedDepositAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Fixed Deposit  Account:Depositing  " + amount + " pound");
		balance += amount;

	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Fixed Deposit Account:Withdrawing " + amount + " pound");
		balance -= amount;

	}

	@Override
	public String toString() {
		return "Fixed Deposit Account [balance =" + balance + " pound ]";
	}

}
