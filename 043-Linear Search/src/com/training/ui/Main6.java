package com.training.ui;

import java.util.Comparator;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main6 {

	private static int search(BillItem[] arr, BillItem searchObject) {

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

	private static int quantitySearch(BillItem[] arr, BillItem searchObject) {

		Comparator comparator = new BillItemQuantityComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

		}
		return -1;
	}
	
	
	private static int priceSearch(BillItem[] arr, BillItem searchObject) {

		Comparator comparator = new BillItemPriceComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {

		BillItem[] billItems = new BillItem[6];

		billItems[0] = new BillItem("Laptop", 12, 50000.00);
		billItems[1] = new BillItem("Mouse", 10, 500.00);
		billItems[2] = new BillItem("Monitor", 5, 5000.00);
		billItems[3] = new BillItem("Printer", 30, 510000.00);
		billItems[4] = new BillItem("Laptop", 7, 75000.00);
		billItems[5] = new BillItem("TV", 25, 60000.00);

		BillItem searchObject = new BillItem("AAA", 13, 2000.00);
		
		int searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);
		
		
		System.out.println("-------------------------------------------");
		
		int quantitySearchResult = quantitySearch(billItems, searchObject);
		if (quantitySearchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + quantitySearchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + quantitySearchResult);
		
		
		System.out.println("-------------------------------------------");
		
		int priceSearchResult = priceSearch(billItems, searchObject);
		if (priceSearchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + priceSearchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + priceSearchResult);

	}

}
