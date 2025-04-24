package com.training.model;

public class Employee {

	private int id;
	private String name;
	private char grade;
	private String gender;
	private double basic;
	private Contact contactInfo;// has a relation

	private PreviousCompany previousCompany;// has a relation
	private SalaryCalculator salaryCalculator;//

	public Employee() {
		super();
	}

	public Employee(int id, String name, char grade, String gender, double salary, Contact contactInfo,
			PreviousCompany previousCompany) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.basic = salary;
		this.contactInfo = contactInfo;
		this.previousCompany = previousCompany;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", gender=" + gender + ", salary="
				+ basic + ", contactInfo=" + contactInfo + ", previousCompany=" + previousCompany + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
		if(this.grade=='A')
			salaryCalculator=new AGradeSalarayCalculator();
		if(this.grade=='B')
			salaryCalculator=new BGradeSalaryCalculator();
		
	}

	public SalaryCalculator getSalaryCalculator() {
		return salaryCalculator;
	}

	public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
		this.salaryCalculator = salaryCalculator;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return basic;
	}

	public void setSalary(double salary) {
		this.basic = salary;
	}

	public Contact getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}

	public PreviousCompany getPreviousCompany() {
		return previousCompany;
	}

	public void setPreviousCompany(PreviousCompany previousCompany) {
		this.previousCompany = previousCompany;
	}

	public double getAllowance() {
		double allowance=this.salaryCalculator.computeAllowance(basic);
		return allowance;
	}
	
	public double getDeduction() {
		double allowance=this.salaryCalculator.computeDeduction(basic);
		return allowance;
	}
	
	public double getNetSalary() {
		double net=this.salaryCalculator.computeNetSalary(basic);
		return net;
	}
}
