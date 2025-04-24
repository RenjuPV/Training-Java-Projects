package com.training.model;

public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double basicSalary, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
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



	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade + "]";
	}
	
	
	
	
	

	
	
	

}
