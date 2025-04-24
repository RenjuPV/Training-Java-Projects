package com.training.model;

public class Manager extends Employee{
	
	private int employeeCount;

	public Manager(int id, String name, String gender, String cityName, double basic, int employeeCount) {
		super(id, name, gender, cityName, basic);
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	@Override
	public double netSalary() {
		double net=super.netSalary();
		net=net+(employeeCount*1000);
		return net ;
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + "]";
	}
	

}
