package com.training.actions;

import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class DeleteAction extends Action{
	boolean status;
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Deleting Customer");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tDeleting a Customer");
		int idToDelete;
		
		ConsoleIO.prompt("Enter Id to Delete");
		idToDelete=ConsoleIO.intInput();
		try {
			if(idToDelete<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Id ");
			ConsoleIO.prompt("Enter Id to Delete");
			idToDelete=ConsoleIO.intInput();
		}
		
		CustomerService service=new CustomerServiceImpl();
		status=service.deleteCustomer(idToDelete);
		
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if(status==true) {
			System.out.println("\t\tDeleting Customer completed successfully");
		}else {
			System.out.println("\t\tDeleting Customer failed");
		}
		System.out.println("\t\t------------------------");
	}

}
