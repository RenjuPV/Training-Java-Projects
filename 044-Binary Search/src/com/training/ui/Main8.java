package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;

import com.training.model.comparators.BillItemQuantityComparator;

public class Main8 {

	public static int search(Account[] arr, Account searchData) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = arr[mid].compareTo(searchData);
			if (r == 0)
				return mid;
			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		Account[] accounts = new Account[6];

		accounts[0] = new Account("Renju", 100.00);
		accounts[1] = new Account("Anju", 500.00);
		accounts[2] = new Account("Anjali", 5000.00);
		accounts[3] = new Account("Shyama", 510000.00);
		accounts[4] = new Account("Suja", 75000.00);
		accounts[5] = new Account("Anila", 60000.00);

		Account searchObject = new Account("Maya", 100.0);

		Arrays.sort(accounts);
		System.out.println(Arrays.toString(accounts));

		int searchResult = search(accounts, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);
	}
}
