package com.training.model;

public class VehicleInsurance implements Insurance{
	
	double vehiclePreAmt;

	@Override
	public void setInsurancePremium(double amount) {
		this.vehiclePreAmt=amount;
		
	}

	@Override
	public double getInsuranceAmount() {
		return 15 * 5* this.vehiclePreAmt;
	}

	public double getVehiclePreAmt() {
		return vehiclePreAmt;
	}

	public void setVehiclePreAmt(double vehiclePreAmt) {
		this.vehiclePreAmt = vehiclePreAmt;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehiclePreAmt=" + vehiclePreAmt + "]";
	}
	
	

}
