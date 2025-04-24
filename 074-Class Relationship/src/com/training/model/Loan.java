package com.training.model;

public abstract class Loan {

	private int loanId;
	private double amount;
	private float noOfYears;

	public Loan() {
		super();
	}

	public Loan(int loanId, double amount, float noOfYears) {
		super();
		this.loanId = loanId;
		this.amount = amount;
		this.noOfYears = noOfYears;

	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public float getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(float noOfYears) {
		this.noOfYears = noOfYears;
	}

	public abstract double getInterestRate();

	public double getInterestAmount() {

		SimpleCalculator simpleCalculator = new SimpleCalculator();

		double interestAmt = simpleCalculator.multiply(this.amount, this.noOfYears);
		return simpleCalculator.multiply(interestAmt, this.getInterestRate());

	}

	public double getTotalRepayable() {

		SimpleCalculator simpleCalculator = new SimpleCalculator();

		return simpleCalculator.add(getInterestAmount(), amount);

	}

	public double getEMI() {

		SimpleCalculator simpleCalculator = new SimpleCalculator();

		double noOFMonth = simpleCalculator.multiply(noOfYears, 12);

		return simpleCalculator.divide(getTotalRepayable(), noOFMonth);

	}

	// relevent fields
	// add methods
	// getInterestrate should be an abstract
	// get interestAmount
	// get totalRepayable
	// getEmi

}
