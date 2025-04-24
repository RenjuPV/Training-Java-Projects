package com.training.model;

public class PersonalLoan extends Loan {
	
	

	@Override
	public double getInterestRate() {
		return 0.13;
	}

	public PersonalLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalLoan(int loanId, double amount, float noOfYears) {
		super(loanId, amount, noOfYears);
		// TODO Auto-generated constructor stub
	}

}
