package com.training.dto.response;

import com.training.model.Customer;

public class CustomerAddResponse {
	
	int statusCode;
	String description;
	Customer customer;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CustomerAddResponse [statusCode=" + statusCode + ", description=" + description + ", customer="
				+ customer + "]";
	}
	

	
	
	
	

}
