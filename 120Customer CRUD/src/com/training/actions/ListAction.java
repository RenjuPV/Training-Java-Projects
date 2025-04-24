package com.training.actions;

import java.util.List;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

public class ListAction extends Action {
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Listing Customer");
		System.out.println("\t\t ----------------");
		
	}

	@Override
	public void execute() {
		//System.out.println("\t\tListing a Customer");
		CustomerService service= new CustomerServiceImpl();
		List<Customer> customerList=service.getAllCustomers();
		
		if(customerList==null || customerList.isEmpty()) {
			System.out.println("\n\n\t\t No Customer Found !!!");
		}
		else {
			System.out.println("\t\t Id \t Name \t   Balance \t Email \t\t\t Phone\n");
			customerList.stream().forEach((s)->{
				System.out.printf("\t\t %d \t%-10s  %5.2f \t %-20s \t %-20s  \n",
						s.getId(),
						s.getName(),
						s.getBalance(),
						s.getEmail(),
						s.getPhone()
						);
			});
			
		}
		
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		System.out.println("\t\tListing Customer completed");
		System.out.println("\t\t------------------------");
	}

}
