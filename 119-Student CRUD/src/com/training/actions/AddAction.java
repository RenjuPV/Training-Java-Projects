package com.training.actions;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class AddAction extends Action{
	boolean status;

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Add New Student");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tAdding a student");
		int rollNumber;
		String name;
		char gender;
		int mark1,mark2;
		
		ConsoleIO.prompt("Enter Roll Number: ");
		rollNumber=ConsoleIO.intInput();
		try {
			if(rollNumber<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tRoll Number cannot be Negative");
			ConsoleIO.prompt("Enter Roll Number: ");
			rollNumber=ConsoleIO.intInput();
		}
		ConsoleIO.prompt("Enter Name: ");
		name=ConsoleIO.stringInput();
		try {
			if(name.isEmpty() || name.equals(null)) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tName cannot be empty");
			ConsoleIO.prompt("Enter Name: ");
			name=ConsoleIO.stringInput();
		}
	
		ConsoleIO.prompt("Enter Gender (M/F): ");
		gender=ConsoleIO.charInput();
		try {
			if(gender!='M'  && gender!='F' && gender!='m'  && gender!='f' ) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tGender Should be M/F");
			ConsoleIO.prompt("Enter Gender (M/F): ");
			gender=ConsoleIO.charInput();
		}
		ConsoleIO.prompt("Enter Mark1: ");
		mark1=ConsoleIO.intInput();
		try {
			if(mark1<0 ||mark1>100) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Mark1");
			ConsoleIO.prompt("Enter Mark1: ");
			mark1=ConsoleIO.intInput();
		}
		ConsoleIO.prompt("Enter Mark2: ");
		mark2=ConsoleIO.intInput();
		try {
			if(mark2<0 ||mark2>100) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Mark2");
			ConsoleIO.prompt("Enter Mark2: ");
			mark2=ConsoleIO.intInput();
		}
		
		Student student=new Student(rollNumber, name, gender, mark1, mark2);
				
		StudentService service=new StudentServiceImpl();
		status=service.addStudent(student);
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if(status==true) {
			System.out.println("\t\tAdding Student completed Successfully");
		}else {
			System.out.println("\t\tAdding Student failed");
		}
		
		System.out.println("\t\t------------------------");
		
	}

}
