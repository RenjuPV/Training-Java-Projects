package com.training.dto.request;

import com.training.model.Customer;

public class CustomerAddRequest {
	
	Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerAddRequest [customer=" + customer + "]";
	}

	
	

}
