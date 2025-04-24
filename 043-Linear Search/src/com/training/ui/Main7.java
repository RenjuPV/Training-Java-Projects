package com.training.ui;

import java.util.Comparator;

import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.comparators.AccountNameComparator;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main7 {
	
	private static int search(Account[] arr, Account searchData) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(searchData))
				return i;
		}
		return -1;
	}

	private static int balanceSearch(Account[] arr, Account searchObject) {

		for (int i = 0; i < arr.length; i++) {

			if (searchObject instanceof Comparable) {

				Comparable searchData = searchObject;
				int r = arr[i].compareTo(searchData);
				if (r == 0)
					return i;

			}
		}
		return -1;
	}

	private static int customerNameSearch(Account[] arr, Account searchObject) {

		Comparator comparator = new AccountNameComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

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
		
		int searchResult = search(accounts, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);
		
		
		System.out.println("-------------------------------------------");
		
		int balanceSearchResult = balanceSearch(accounts, searchObject);
		if (balanceSearchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + balanceSearchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + balanceSearchResult);
		
		
		System.out.println("-------------------------------------------");
		
		int customerSearchResult = customerNameSearch(accounts, searchObject);
		if (customerSearchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + customerSearchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + customerSearchResult);
	}

}
