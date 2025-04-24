package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int custId;
	private String custName;
	private String gender;

	private Address address;
	private Contact contact;
	private Account account;
	private List<Loan> loans;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName, String gender, Address address, String email, String phoneNo,
			String accountType, String accNo, double balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.address = address;

		this.contact = new Contact(email, phoneNo);

		this.loans = new ArrayList<Loan>();
		setAccount(accountType, accNo, balance);
		addLoan();
	}

	public void setAccount(String accountType, String accNo, double balance) {
		if (accountType.equalsIgnoreCase("Savings"))
			this.account = new SavingsAccount(accNo, balance);
		if (accountType.equalsIgnoreCase("Current"))
			this.account = new CurrentAccount(accNo, balance);

	}

	public void addLoan() {
		Loan loan1 = new HomeLoan(101, 20000, 10);
		Loan loan2 = new PersonalLoan(102, 100000, 5);
		List<Loan> loans = new ArrayList<>();
		loans.add(loan1);
		loans.add(loan2);
	}

	private class Contact {

		private String emailId;
		private String phoneNumber;

		public Contact() {
			super();
		}

		public Contact(String emailId, String phoneNumber) {
			super();
			this.emailId = emailId;
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "Contact [emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
		}

	}

	private interface Account {

		void deposit(double amount) throws Exception;

		void withDraw(double amount) throws Exception;

	}

	private class SavingsAccount implements Account {

		private String accNo;
		private double balance = 0.0;

		public SavingsAccount() {
			super();
		}

		public SavingsAccount(String accNo, double balance) {
			super();
			this.accNo = accNo;
			this.balance = balance;

		}

		@Override
		public void deposit(double amount) throws Exception {
			SimpleCalculator simpleCalculator = new SimpleCalculator();
			System.out.println("Deposited : " + amount + "Balance : " + simpleCalculator.add(balance, amount));

		}

		@Override
		public void withDraw(double amount) throws Exception {
			SimpleCalculator simpleCalculator = new SimpleCalculator();
			System.out.println("Withdrawed : " + amount + "Balance : " + simpleCalculator.subtract(amount, balance));

		}

		@Override
		public String toString() {
			return "SavingsAccount [accNo=" + accNo + ", balance=" + balance + "]";
		}

	}

	private class CurrentAccount implements Account {

		private String accNo;
		private double balance = 500.0;

		public CurrentAccount() {
			super();
		}

		public CurrentAccount(String accNo, double balance) {
			super();
			this.accNo = accNo;
			this.balance = balance;

		}

		@Override
		public void deposit(double amount) throws Exception {
			SimpleCalculator simpleCalculator = new SimpleCalculator();

			System.out.println("Deposited : " + amount + "Balance : " + simpleCalculator.add(balance, amount));

		}

		@Override
		public void withDraw(double amount) throws Exception {
			SimpleCalculator simpleCalculator = new SimpleCalculator();
			System.out.println("Withdrawed : " + amount + "Balance : " + simpleCalculator.subtract(balance, amount));
		}

		@Override
		public String toString() {
			return "CurrentAccount [accNo=" + accNo + ", balance=" + balance + "]";
		}
	}

	private abstract class Loan {

		private int loanId;
		private double amount;
		private float noOfYears;

		public Loan() {
			super();
		}

		public Loan(int loanId, double amount, float noOfYears) {
			super();
			this.loanId = loanId;
			this.amount = amount;
			this.noOfYears = noOfYears;

		}

		public abstract double getInterestRate();

		public double getInterestAmount() {

			SimpleCalculator simpleCalculator = new SimpleCalculator();

			double interestAmt = simpleCalculator.multiply(this.amount, this.noOfYears);
			return simpleCalculator.multiply(interestAmt, this.getInterestRate());

		}

		public double getTotalRepayable() {

			SimpleCalculator simpleCalculator = new SimpleCalculator();

			return simpleCalculator.add(getInterestAmount(), amount);

		}

		public double getEMI() {

			SimpleCalculator simpleCalculator = new SimpleCalculator();

			double noOFMonth = simpleCalculator.multiply(noOfYears, 12);

			return simpleCalculator.divide(getTotalRepayable(), noOFMonth);

		}

		@Override
		public String toString() {
			return "Loan [loanId=" + loanId + ", amount=" + amount + ", noOfYears=" + noOfYears + "]";
		}
	}

	private class PersonalLoan extends Loan {

		@Override
		public double getInterestRate() {
			return 0.13;
		}

		public PersonalLoan() {
			super();
		}

		public PersonalLoan(int loanId, double amount, float noOfYears) {
			super(loanId, amount, noOfYears);
		}

	}

	private class HomeLoan extends Loan {

		@Override
		public double getInterestRate() {

			return 0.10;
		}

		public HomeLoan() {
			super();
		}

		public HomeLoan(int loanId, double amount, float noOfYears) {
			super(loanId, amount, noOfYears);
		}

	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", address=" + address
				+ ", contact=" + contact + ", account=" + account + ", loans=" + loans + "]";
	}

}
