package com.training.actions;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class AddAction extends Action {
	boolean status;

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Add New Customer");
		System.out.println("\t\t------------------------");

	}

	@Override
	public void execute() {
		System.out.println("\t\tAdding a Customer");
		int id;
		String name;
		double balance;
		String email;
		String phone;

		ConsoleIO.prompt("Enter Id: ");
		id = ConsoleIO.intInput();
		try {
			if (id < 0) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.err.println("\t\tId cannot be Negative");
			ConsoleIO.prompt("Enter Id: ");
			id = ConsoleIO.intInput();
		}
		
		ConsoleIO.prompt("Enter Name: ");
		name = ConsoleIO.stringInput();
		try {
			if (name.isEmpty() || name.equals(null)) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.err.println("\t\tName cannot be empty");
			ConsoleIO.prompt("Enter Name: ");
			name = ConsoleIO.stringInput();
		}

		ConsoleIO.prompt("Enter balance: ");
		balance = ConsoleIO.doubleInput();
		try {
			if (balance < 0) {
				throw new Exception();
			}

		} catch (Exception e) {
			System.err.println("\t\tEnter a positive number");
			ConsoleIO.prompt("Enter Balance: ");
			balance = ConsoleIO.charInput();
		}
		
		ConsoleIO.prompt("Enter Email: ");
		email = ConsoleIO.stringInput();
		
		ConsoleIO.prompt("Enter Phone: ");
		phone = ConsoleIO.stringInput();
		
		Customer customer = new Customer(id, name, balance, email, phone);

		CustomerService service = new CustomerServiceImpl();
		status = service.addCustomer(customer);
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if (status == true) {
			System.out.println("\t\tAdding Customer completed Successfully");
		} else {
			System.out.println("\t\tAdding Cusomer failed");
		}

		System.out.println("\t\t------------------------");

	}

}
