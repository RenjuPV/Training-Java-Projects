package com.training.model;

public class Guest {
	
	String name;
	String gender;
	String phoneNumber;
	String nationality;
	
	public Guest() {
		super();
	}


	public Guest(String name, String gender, String phoneNumber, String nationality) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "\nGuest [name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", nationality="
				+ nationality + "]";
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	

	
	
	

}
