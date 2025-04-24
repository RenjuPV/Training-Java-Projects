package com.training.ui;

import com.training.model.InvalidCustomerNameException;
import com.training.model.Loan;

public class Main5 {

	public static void main(String[] args) throws InvalidCustomerNameException {

		Loan loan = new Loan(101, "Renju", -1, 12);

		try {

			loan.setCustomerName(null);

		} catch (InvalidCustomerNameException e) {

			System.out.println(e.getMessage());
		}

		try {
			loan.setLoanId(-1);
			loan.setTenure(-1);
			loan.setLoanAmount(-200);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
