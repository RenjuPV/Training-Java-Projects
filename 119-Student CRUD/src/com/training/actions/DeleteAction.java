package com.training.actions;

import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class DeleteAction extends Action{
	boolean status;
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Deleting Student");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tDeleting a student");
		int rollNumberToDelete;
		
		ConsoleIO.prompt("Enter Roll Number to Delete");
		rollNumberToDelete=ConsoleIO.intInput();
		try {
			if(rollNumberToDelete<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Roll Number ");
			ConsoleIO.prompt("Enter Roll Number to Delete");
			rollNumberToDelete=ConsoleIO.intInput();
		}
		
		StudentService service=new StudentServiceImpl();
		status=service.deleteStudent(rollNumberToDelete);
		
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if(status) {
			System.out.println("\t\tDeleting Student completed successfully");
		}else {
			System.out.println("\t\tDeleting Student failed");
		}
		System.out.println("\t\t------------------------");
	}

}
