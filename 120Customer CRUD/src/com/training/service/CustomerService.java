package com.training.service;

import java.util.List;

import com.training.model.Customer;

public interface CustomerService {
	
		boolean addCustomer(Customer customer);
		Customer searchCustomer(int id);
		boolean updateCustomer(Customer customer);
		List<Customer> getAllCustomers();
		boolean deleteCustomer(int id);
}
