package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Account;
import com.training.model.Address;
import com.training.model.Contact;
import com.training.model.Customer;
import com.training.model.HomeLoan;
import com.training.model.Loan;
import com.training.model.PersonalLoan;
import com.training.model.SavingsAccount;

public class Main1 {

	public static void main(String[] args) {

		Address address = new Address("Souparnika", "Kochi", "686636");
		Contact contact = new Contact("renju@gmail.com", "9497473933");
		Account sa = new SavingsAccount("Ac001", 100.0);

		Loan loan1 = new HomeLoan(101, 100000, 10);
		Loan loan2 = new PersonalLoan(102, 100000, 5);
		List<Loan> loans = new ArrayList<>();
		loans.add(loan1);
		loans.add(loan2);

		Customer customer = new Customer();
		customer.setCustId(1);
		customer.setCustName("Renju");
		customer.setAddress(address);
		customer.setGender("Female");
		customer.setContact(contact);
		customer.setAccount(sa);
		customer.setLoans(loans);
		System.out.println(customer.getCustId());
		System.out.println(customer.getCustName());
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

	}

}
