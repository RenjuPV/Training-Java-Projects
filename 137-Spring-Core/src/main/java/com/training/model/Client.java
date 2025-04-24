package com.training.model;

public class Client {
	
	Contact contact;
	Account account;
	Insurance insurance;
	
	int id;
	String name;
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
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
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
	@Override
	public String toString() {
		return "Client [contact=" + contact + ", account=" + account + ", insurance=" + insurance + ", id=" + id
				+ ", name=" + name + "]";
	}
	
	

}
