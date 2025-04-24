package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Account;

public class AccountNameComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {

		return o1.getCustomerName().compareTo(o2.getCustomerName());

	}

}
