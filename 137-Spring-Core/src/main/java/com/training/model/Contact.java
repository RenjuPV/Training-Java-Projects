package com.training.model;

public class Contact {

	String emailId;
	String phNo;

	
	
	public Contact() {
		super();
	}

	public Contact(String emailId, String phNo) {
		super();
		this.emailId = emailId;
		this.phNo = phNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Contact [emailId=" + emailId + ", phNo=" + phNo + "]";
	}

}
