package com.training.model;

public abstract class LoanImpl implements Loan {
	
	double loanAmt;
	int tenure;
	
	public LoanImpl() {
		super();
	}
	
	
	public LoanImpl(double loanAmt, int tenure) {
		super();
		this.loanAmt = loanAmt;
		this.tenure = tenure;
	}



	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public abstract double getInterestRate();


	@Override
	public void printDetails() {
		System.out.println("Loan Amount:"+this.loanAmt);
		System.out.println("Loan Tenure:"+this.tenure);
		System.out.println("Interest Rate :"+this.getInterestRate());
		
	}
	
	

}
