package com.training.dp;

public class User {
	
	private String name;
	private String phonetNumber;
	private String email;
	
	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonetNumber() {
		return phonetNumber;
	}

	public void setPhonetNumber(String phonetNumber) {
		this.phonetNumber = phonetNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(String name, String phonetNumber, String email) {
		super();
		this.name = name;
		this.phonetNumber = phonetNumber;
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", phonetNumber=" + phonetNumber + ", email=" + email + "]";
	}

}
