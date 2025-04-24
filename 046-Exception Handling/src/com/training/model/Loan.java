package com.training.model;

public class Loan {

	private int loanId;
	private String customerName;
	private double loanAmount;
	private int tenure;
	
	

	public Loan() {
		super();
	}

	public Loan(int loanId, String customerName, double loanAmount, int tenure) throws InvalidCustomerNameException {
		super();
		setLoanId(loanId);
		setCustomerName(customerName);
		setLoanAmount(loanAmount);
		setTenure(tenure);
		
	}

	public int getLoanId() {

		return loanId;
	}

	public void setLoanId(int loanId) {

		if (loanId < 0) {

			InvalidLoanIdException e = new InvalidLoanIdException("Loan id should not be negative :" + loanId);
			throw e;

		}
		this.loanId = loanId;
	}

	public String getCustomerName() {

		return customerName;
	}

	public void setCustomerName(String customerName) throws InvalidCustomerNameException {

		if (customerName == null || customerName.length() == 0) {

			InvalidCustomerNameException e = new InvalidCustomerNameException("Name can not be null...." + customerName);
			throw e;

		}
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount < 0) {

			InvalidLoanAmountException e = new InvalidLoanAmountException("Loan amount greater than zero" + loanAmount);
			throw e;

		}
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		if (tenure < 0) {

			InvalidLoanTenureException e = new InvalidLoanTenureException("Loan tenure greater than zero" + tenure);
			throw e;

		}
		this.tenure = tenure;
	}

}
