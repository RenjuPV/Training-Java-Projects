package com.training.model;

import java.util.Objects;

public class Account implements Comparable<Account> {

	String customerName;
	double balance;

	public Account(String customerName, double balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\nAccount [customerName=" + customerName + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(customerName, other.customerName);
	}

	@Override
	public int compareTo(Account o) {
		if (this.balance < o.balance)
			return -1;
		if (this.balance > o.balance)
			return 1;

		return 0;

	}

}
