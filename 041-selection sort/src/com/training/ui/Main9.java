package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;

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
		int iMin;

		AccountNameComparator comparator = new AccountNameComparator();

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {

				int r = comparator.compare(accounts[j], accounts[iMin]);

				if (r < 0)
					iMin = j;
			}

			Account temp;
			temp = accounts[i];
			accounts[i] = accounts[iMin];
			accounts[iMin] = temp;

		}

		System.out.println(Arrays.toString(accounts));
		accounts = null;

	}

}
