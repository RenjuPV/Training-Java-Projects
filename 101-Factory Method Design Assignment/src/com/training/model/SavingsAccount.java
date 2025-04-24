package com.training.model;

class SavingsAccount implements Account {
	double balance;

	SavingsAccount() {
		super();
	}

	SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void setBalance(double balanceAmt) {

		this.balance = balanceAmt;
		System.out.println("Savings Account Balance : " + this.balance);
	}

	@Override
	public void withdraw(double withdrawAmt) {
		this.balance = this.balance - withdrawAmt;
		System.out.println("Amount withdrawed : " + withdrawAmt);
		System.out.println("Savings Account  balance  after withdrawal: " + this.balance);

	}

	@Override
	public void deposit(double depostamt) {

		this.balance = this.balance + depostamt;
		System.out.println("Amount Deposited : " + depostamt);
		System.out.println("Savings Account balance after deposit  : " + this.balance);

	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}

}
