package com.training.model;

public class HomeLoan extends Loan{

	@Override
	public double getInterestRate() {
		
		return 0.10;
	}

	public HomeLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeLoan(int loanId, double amount, float noOfYears) {
		super(loanId, amount, noOfYears);
		// TODO Auto-generated constructor stub
	}
	
	

}
