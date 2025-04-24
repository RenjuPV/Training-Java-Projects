package com.training.ui;

import com.training.model.Contact;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.PreviousCompany;

public class Main2 {

	public static void main(String[] args) {

		Contact contact = new Contact("renju@gmail.com", "9478678678");
		PreviousCompany previousCompany = new PreviousCompany("TCS", "developer", 5, 30000);
		Manager manager = new Manager();
		manager.setEmployeeCount(10);
		manager.setId(1055);
		manager.setName("Renju");
		manager.setGrade('A');
		manager.setGender("Female");
		manager.setSalary(15000.0);
		manager.setContactInfo(contact);
		manager.setPreviousCompany(previousCompany);

		System.out.println("ID : "+manager.getId());
		System.out.println("Name : "+manager.getName());
		System.out.println("Grade : "+manager.getGrade());
		System.out.println("Gender : "+manager.getGender());
		System.out.println("Email : "+manager.getContactInfo().getEmailId());
		System.out.println("Phone Number : "+manager.getContactInfo().getPhoneNumber());
		System.out.println("Employee Count : "+manager.getEmployeeCount());
		System.out.println("Compay Name : "+manager.getPreviousCompany().getName());
		System.out.println("Designation : "+manager.getPreviousCompany().getDesignation());
		System.out.println("Experience :"+manager.getPreviousCompany().getNoOfYears());
		System.out.println("Previous Salary : "+manager.getPreviousCompany().getSalary());
		System.out.println("Basic : "+manager.getSalary());
		System.out.println("Allowance : "+manager.getAllowance());
		System.out.println("Deduction : "+manager.getDeduction());
		System.out.println("Net Salary : "+manager.getNetSalary());

	}

}
