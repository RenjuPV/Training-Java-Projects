package com.training.model;

public class Employee {
	String name;
	double basicSalary;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if(name==null || name.isEmpty()) {
			Exception e=new Exception("Invalid value for name");
			throw e;
		}
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws Exception {
		if(basicSalary<0) {
			Exception e= new Exception("Negative Salary Not Acceptable");
			throw e;
		}
		this.basicSalary = basicSalary;
	}

	

}
