package com.training.model;

public class Manager extends Employee {
	
	private int employeeCount;

	public Manager() {
		super();
	}

	public Manager(int id, String name, char grade, String gender, double salary, Contact contactInfo,
			PreviousCompany previousCompany, int employeeCount) {
		super(id, name, grade, gender, salary, contactInfo, previousCompany);
		this.employeeCount = employeeCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + ", getEmployeeCount()=" + getEmployeeCount() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getGrade()=" + getGrade() + ", getSalaryCalculator()="
				+ getSalaryCalculator() + ", getGender()=" + getGender() + ", getSalary()=" + getSalary()
				+ ", getContactInfo()=" + getContactInfo() + ", getPreviousCompany()=" + getPreviousCompany()
				+ ", getAllowance()=" + getAllowance() + ", getDeduction()=" + getDeduction() + ", getNetSalary()="
				+ getNetSalary() + "]";
	}
	
	

}
