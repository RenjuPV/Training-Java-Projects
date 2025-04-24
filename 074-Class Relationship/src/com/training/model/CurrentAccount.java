package com.training.model;

public class CurrentAccount implements Account {

	private String accNo;
	private double balance=500.0;
	
	

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accNo,  double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		
	}
	

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	

	@Override
	public void deposit(double amount) throws Exception {
		SimpleCalculator simpleCalculator=new SimpleCalculator();

		System.out.println("Deposited : " + amount + "Balance : " + simpleCalculator.add(balance, amount));

	}

	@Override
	public void withDraw(double amount) throws Exception {
		SimpleCalculator simpleCalculator=new SimpleCalculator();
		System.out.println("Withdrawed : " + amount + "Balance : " + simpleCalculator.subtract(balance, amount));
	}

	@Override
	public String toString() {
		return "CurrentAccount [accNo=" + accNo + ", balance=" + balance
				+ "]";
	}
	
	

}
