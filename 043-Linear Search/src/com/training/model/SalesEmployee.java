package com.training.model;

public class SalesEmployee extends Employee{
	private double salesAmount;

	public SalesEmployee(int id, String name, String gender, String cityName, double basic, double salesAmount) {
		super(id, name, gender, cityName, basic);
		this.salesAmount = salesAmount;
	}

	public SalesEmployee() {
		super();
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	
	@Override
	public double netSalary() {
		
		double net= super.netSalary();
		net=net+(this.salesAmount*0.25);
		return net;
	}

	
	
	
	

}
