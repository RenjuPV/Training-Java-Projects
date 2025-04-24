package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.comparators.AccountNameComparator;

public class Main9 {
	public static void main(String[] args) {

		Account[] accounts = new Account[6];

		accounts[0] = new Account("Renju", 100.00);
		accounts[1] = new Account("Anju", 500.00);
		accounts[2] = new Account("Anjali", 5000.00);
		accounts[3] = new Account("Shyama", 510000.00);
		accounts[4] = new Account("Suja", 75000.00);
		accounts[5] = new Account("Anila", 60000.00);

		int n = accounts.length;
		
		AccountNameComparator comparator = new AccountNameComparator();

		for (int i = 1; i < n; ++i) {

			Account key = accounts[i];
			int j = i - 1;
			int r = comparator.compare(accounts[j],key);
			while (j >= 0 && r >0) {

				accounts[j + 1] = accounts[j];
				j = j - 1;
				if (j >= 0)
					r = comparator.compare(accounts[j],key);
			}

			accounts[j + 1] = key;

		}

		System.out.println(Arrays.toString(accounts));
		accounts = null;

	}

}
