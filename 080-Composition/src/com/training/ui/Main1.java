package com.training.ui;


import java.util.ArrayList;
import java.util.List;

import com.training.model.Address;
import com.training.model.Contact;
import com.training.model.Customer;

public class Main1 {

	public static void main(String[] args) {

		Address address = new Address("Souparnika", "Kochi", "686636");
		

		

		Customer customer = new Customer(1001, "Renju", "Female", address, "renju@gmail.com","949747393","Savings", "Acc001", 15000.00);
		
		System.out.println(customer.toString());
		
		
		
		/*
		 * 	System.out.println(customer.getCustName());
		System.out.println(customer.getGender());
		System.out.println(customer.getAddress().getHouseName());
		System.out.println(customer.getAddress().getCityName());
		System.out.println(customer.getAddress().getPinCode());

		System.out.println(customer.getContact().getEmailId());
		System.out.println(customer.getContact().getPhoneNumber());
		try {
			customer.getAccount().deposit(20000);
			customer.getAccount().withDraw(1000);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		for (Loan loan : customer.getLoans()) {
			System.out.println("Loan Id:" + loan.getLoanId());
			System.out.println("Amount : "+loan.getAmount());
			System.out.println("Interest Rate: "+loan.getInterestRate());
			System.out.println("No of Years: "+loan.getNoOfYears());
			System.out.println("Interest Amount: "+loan.getInterestAmount());
			System.out.println("Total Repayable Amount: "+loan.getTotalRepayable());
			System.out.println("EMI:  "+loan.getEMI());

		}
		 */
	

	} 

}
	
