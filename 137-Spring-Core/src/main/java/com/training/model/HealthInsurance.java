package com.training.model;

public class HealthInsurance implements Insurance {

	double premiumAmt;
	
	

	public double getPremiumAmt() {
		return premiumAmt;
	}

	public void setPremiumAmt(double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}

	@Override
	public void setInsurancePremium(double amount) {

		this.premiumAmt = premiumAmt;
	}

	@Override
	public double getInsuranceAmount() {
		return 15 * 12 * this.premiumAmt;
	}

	@Override
	public String toString() {
		return "HealthInsurance [premiumAmt=" + premiumAmt + "]";
	}
	
	

}
