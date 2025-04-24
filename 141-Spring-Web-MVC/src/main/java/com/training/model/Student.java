package com.training.model;

public class Student {
	int rollNumber;
	String name;
	String gender;
	int mark1;
	int mark2;
	
	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	

	public Student(int rollNumber, String name, String gender, int mark1, int mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	

	public Student() {
		super();
	}
	

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", gender=" + gender + ", mark1=" + mark1
				+ ", mark2=" + mark2 + "]";
	}

	public int getTotal() {
		return this.mark1+this.mark2;
		
	}
	
	public float getAverage() {
		return this.getTotal()/2;
		
	}

}
