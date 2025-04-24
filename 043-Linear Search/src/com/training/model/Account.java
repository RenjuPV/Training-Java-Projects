package com.training.model;

import java.util.Objects;

public class Account implements Comparable {
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
	public int compareTo(Object o) {
		Account other = (Account) o;
		if (this.balance < other.balance)
			return -1;
		if (this.balance > other.balance)
			return 1;

		return 0;
	}

	@Override
	public String toString() {
		return "\nAccount [customerName=" + customerName + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Account))
			return false;
		Account other = (Account) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	

}
