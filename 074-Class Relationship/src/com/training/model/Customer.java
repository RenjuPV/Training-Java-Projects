package com.training.model;

import java.util.List;

public class Customer {
	
	private int custId;
	private String custName;
	private String gender;
	
	private Address address;
	private Contact contact;
	private Account account;
	private List<Loan> loans;
	
	
	
	public Customer() {
		super();
	}



	public Customer(int custId, String custName, String gender, Address address, Contact contact, Account account,
			List<Loan> loans) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.address = address;
		this.contact = contact;
		this.account = account;
		this.loans = loans;
	}





	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public List<Loan> getLoans() {
		return loans;
	}



	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}





	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", address=" + address
				+ ", contact=" + contact + ", account=" + account + ", loans=" + loans + "]";
	}





	
	
	
	
	
}
