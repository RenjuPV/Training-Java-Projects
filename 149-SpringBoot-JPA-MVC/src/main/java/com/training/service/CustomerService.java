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
	
	public Customer addCustomer(Customer customer) {
		Customer s=repo.save(customer);
		return s;
	}
	
	public Customer updateCustomer(Customer customer) {
		Customer s=repo.save(customer);
		return s;
	}
	
	public boolean deleteCustomer(Customer customer) {
		repo.delete(customer);
		return true;
		
	}
	
	public Customer searchCustomer(int rollNumber) {
		Optional<Customer>optional=repo.findById(rollNumber);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}
	
	public List<Customer> getAllCustomers() {
		
			return repo.findAll();
		
		
	}
	

}
