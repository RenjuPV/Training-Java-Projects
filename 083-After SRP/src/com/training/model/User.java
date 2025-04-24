package com.training.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class User {

	private String name;
	private String emailId;
	private String phoneNo;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User []";
	}

	public User(String name, String emailId, String phoneNo) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	
	
	
	
	
}
