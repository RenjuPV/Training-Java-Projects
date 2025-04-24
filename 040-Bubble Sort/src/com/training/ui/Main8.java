package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.BillItem;

public class Main8 {

	public static void main(String[] args) {

		Account[] accounts = new Account[6];

		accounts[0] = new Account("Renju", 100.00);
		accounts[1] = new Account("Anju", 500.00);
		accounts[2] = new Account("Anjali", 5000.00);
		accounts[3] = new Account("Shyama", 510000.00);
		accounts[4] = new Account("Suja", 75000.00);
		accounts[5] = new Account("Anila", 60000.00);

		for (int i = 0; i < accounts.length; i++) {

			for (int j = 0; j < accounts.length - i - 1; j++) {

				int r = accounts[j].compareTo(accounts[j + 1]);

				if (r > 0) {
					Account temp;
					temp = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(accounts));
		accounts = null;

	}

}
