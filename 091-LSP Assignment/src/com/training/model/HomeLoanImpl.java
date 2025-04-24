package com.training.model;

public class HomeLoanImpl extends LoanImpl {

	private String properyLocation;

	public HomeLoanImpl() {
		super();
	}

	public String getProperyLocation() {
		return properyLocation;
	}

	public void setProperyLocation(String properyLocation) {
		this.properyLocation = properyLocation;
	}

	public HomeLoanImpl(double loanAmt, int tenure, String properyLocation) {
		super(loanAmt, tenure);
		this.properyLocation = properyLocation;
	}



	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Property Location : "+this.properyLocation);
	}

	@Override
	public double getInterestRate() {
		
		return 0.25;
	}

}
