package com.training.actions;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class SearchAction extends Action{

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Searching Student");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tSearching a student");
		int searchRollNumber;
		
		ConsoleIO.prompt("Enter Roll Number to Search: ");
		searchRollNumber=ConsoleIO.intInput();
		try {
			if(searchRollNumber<0) {
				throw new Exception();
			}
				
		} catch (Exception e) {
			System.err.println("\t\tInvalid Roll Number");
			ConsoleIO.prompt("Enter Roll Number to Search: ");
			searchRollNumber=ConsoleIO.intInput();
		}
		
		StudentService service=StudentServiceImpl.getInstance();
		Student student=service.searchStudent(searchRollNumber);
		if(student!=null)
		{
		System.out.println("\t\t Roll Number : "+student.getRollNumber());
		System.out.println("\t\t Name        : "+student.getName());
		System.out.println("\t\t Gender      : "+student.getGender());
		System.out.println("\t\t Mark1       : "+student.getMark1());
		System.out.println("\t\t Mark2       : "+student.getMark2());
		System.out.println("\t\t Total       : "+student.getTotal());
		System.out.println("\t\t Average     : "+student.getAverage());
		}
		else
		{
			System.out.println("\n\n\t\t Student not Found !!!");
		}
	}

	@Override
	public void complete() {
		System.out.println("\t\tSearching Student completed");
		System.out.println("\t\t------------------------");
	}

}
