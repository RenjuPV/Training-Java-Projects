package com.training.ui;

import com.training.model.Contact;
import com.training.model.Employee;
import com.training.model.PreviousCompany;

public class Main1 {
	
	public static void main(String[] args) {
		
		Contact contact=new Contact("kiran@gmail.com", "9478678678");
		PreviousCompany previousCompany=new PreviousCompany("Wipro", "developer",5 , 30000);
		Employee employee=new Employee();
		employee.setId(1055);
		employee.setName("Kiran");
		employee.setGrade('A');
		employee.setGender("Male");
		employee.setSalary(15000.0);
		employee.setContactInfo(contact);
		employee.setPreviousCompany(previousCompany);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getGrade());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.getContactInfo().getEmailId());
		System.out.println(employee.getContactInfo().getPhoneNumber());
		System.out.println(employee.getPreviousCompany().getName());
		System.out.println(employee.getPreviousCompany().getDesignation());
		System.out.println(employee.getPreviousCompany().getNoOfYears());
		System.out.println(employee.getPreviousCompany().getSalary());
		System.out.println(employee.getAllowance());
		System.out.println(employee.getDeduction());
		System.out.println(employee.getNetSalary());
		
		
	}

}
