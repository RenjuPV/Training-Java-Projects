package com.training.model;

public class Student {
	int rollNumber;
	String name;
	Contact contact;
	
	

	public Student(int rollNumber, String name, Contact contact) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.contact = contact;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", contact=" + contact + "]";
	}

	

}
