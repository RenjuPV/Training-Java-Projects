package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;


public class Main8 {
	public static void main(String[] args) {
		
		Account[] accounts = new Account[6];

		accounts[0] = new Account("Renju", 100.00);
		accounts[1] = new Account("Anju", 500.00);
		accounts[2] = new Account("Anjali", 5000.00);
		accounts[3] = new Account("Shyama", 510000.00);
		accounts[4] = new Account("Suja", 75000.00);
		accounts[5] = new Account("Anila", 60000.00);
		
		int n = accounts.length;
		for (int i = 1; i < n; ++i) {

			Account key = accounts[i];
			int j = i - 1;
			int r = accounts[j].compareTo(key);
			while (j >= 0 && r > 0) {

				accounts[j + 1] = accounts[j];
				j = j - 1;
				if (j >= 0)
					r = accounts[j].compareTo(key);

			}

			accounts[j + 1] = key;

		}

		System.out.println(Arrays.toString(accounts));
		accounts = null;


	}

}
