package com.training.model;

public class PreviousCompany {

	private String name;
	private String designation;
	private int noOfYears;
	private double salary;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getNoOfYears() {
		return noOfYears;
	}


	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public PreviousCompany() {
		super();
	}


	public PreviousCompany(String name, String designation, int noOfYears, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.noOfYears = noOfYears;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "PreviousCompany [name=" + name + ", designation=" + designation + ", noOfYears=" + noOfYears
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
}
