package com.training.model;

public class CarLoanImpl extends LoanImpl {

	private String regNo;

	public CarLoanImpl() {
		super();
	}

	public CarLoanImpl(double loanAmt, int tenure, String regNo) {
		super(loanAmt, tenure);
		this.regNo = regNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	@Override
	public double getInterestRate() {

		return 0.45;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Registration No : " + this.regNo);
	}
}
