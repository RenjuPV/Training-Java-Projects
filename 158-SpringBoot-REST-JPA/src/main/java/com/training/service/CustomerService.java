package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerRepository;
import com.training.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;

	public Customer addNewCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer searchCustomer(Customer customer) {
		Optional<Customer> optional = repo.findById(customer.getId());
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	public Customer searchCustomers(int id) {
		Optional<Customer> optional = repo.findById(id);
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();

	}

	public boolean deleteCustomer(Customer customer) {
		repo.delete(customer);
		return true;
	}
	
	
	public List<Customer> getAllCustomersByName(String name) {
		return repo.findByName(name);

	}
	public List<Customer> getAllCustomersByPhoneNumber(String phone) {
		return repo.findByPhone(phone);

	}
	
	

}
