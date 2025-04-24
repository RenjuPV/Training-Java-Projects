package com.training.model;

public class HomeLoan implements Loan {
	double la;

	@Override
	public void setLoanAmount(double amount) {
		this.la = amount;

	}

	@Override
	public double getInterestAmount() {
		return this.la * 12 * 0.11;
	}

	@Override
	public String toString() {
		return "HomeLoan [la=" + la + "]";
	}
	
	

}
