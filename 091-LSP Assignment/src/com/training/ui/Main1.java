package com.training.ui;

import com.training.model.CarLoanImpl;
import com.training.model.HomeLoanImpl;
import com.training.model.Loan;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("-----Car Loan Details----");
		Loan loan = new CarLoanImpl(10000, 5, "KL67555");
		loan.printDetails();
		
		
		System.out.println("-----------------------");
		
		System.out.println("-----Home Loan Details----");
		loan = new HomeLoanImpl(15000, 10, "Kochi");
		loan.printDetails();
		
	}

}
