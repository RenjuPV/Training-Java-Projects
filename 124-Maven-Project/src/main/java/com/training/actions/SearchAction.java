package com.training.actions;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class SearchAction extends Action{

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Searching Customer");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tSearching a Customer");
		int searchId;
		
		ConsoleIO.prompt("Enter Id to Search: ");
		searchId=ConsoleIO.intInput();
		try {
			if(searchId<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Id");
			ConsoleIO.prompt("Enter Id to Search: ");
			searchId=ConsoleIO.intInput();
		}
		
		CustomerService service=new CustomerServiceImpl();
		Customer customer=service.searchCustomer(searchId);
		if(customer!=null)
		{
		System.out.println("\t\t Id : "+customer.getId());
		System.out.println("\t\t Name        : "+customer.getName());
		System.out.println("\t\t Balance      : "+customer.getBalance());
		System.out.println("\t\t Email       : "+customer.getEmail());
		System.out.println("\t\t Phone       : "+customer.getPhone());
		
		}
		else
		{
			System.out.println("\n\n\t\t Customer not Found !!!");
		}
	}

	@Override
	public void complete() {
		System.out.println("\t\tSearching Customer completed");
		System.out.println("\t\t------------------------");
	}

}
