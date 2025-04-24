package com.training.actions;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class UpdateAction extends Action{
boolean status;
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Updating Student");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tUpdating a student");
		int rollNumber;
		String name;
		char gender;
		int mark1,mark2;
		
		ConsoleIO.prompt("Enter Roll Number to update : ");
		rollNumber=ConsoleIO.intInput();
		try {
			if(rollNumber<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid RollNumber");
			ConsoleIO.prompt("Enter Roll Number to update : ");
			rollNumber=ConsoleIO.intInput();
		}
		ConsoleIO.prompt("Enter Name to update : ");
		name=ConsoleIO.stringInput();
		try {
			if(name.isEmpty() || name.equals(null)) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tName cannot be empty");
			ConsoleIO.prompt("Enter Name to update : ");
			name=ConsoleIO.stringInput();
		}
		ConsoleIO.prompt("Enter Gender (M/F) to update : ");
		gender=ConsoleIO.charInput();
		try {
			if(gender!='M' && gender!='F') {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tGender Should be M/F");
			ConsoleIO.prompt("Enter Gender (M/F) to update : ");
			gender=ConsoleIO.charInput();
		}
		ConsoleIO.prompt("Enter Mark1 to update : ");
		mark1=ConsoleIO.intInput();
		try {
			if(mark1<0 ||mark1>100) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Mark1");
			ConsoleIO.prompt("Enter Mark1 to update : ");
			mark1=ConsoleIO.intInput();
		}
		ConsoleIO.prompt("Enter Mark2 to update : ");
		mark2=ConsoleIO.intInput();
		try {
			if(mark2<0 ||mark2>100) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Mark2");
			ConsoleIO.prompt("Enter Mark2 to update : ");
			mark2=ConsoleIO.intInput();
		}
		
		Student student=new Student(rollNumber, name, gender, mark1, mark2);
		
		StudentService service=new StudentServiceImpl();;
		status=service.updateStudent(student);
		
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if(status) {
			System.out.println("\t\tUpdating Student completed successfully");
		}else {
			System.out.println("\t\tUpdating Student failed");
		}
		
		System.out.println("\t\t------------------------");
		
	}

}
