package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;


public class Main5 {
	

	public static int search(BillItem[] arr, BillItem searchData) {

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

		BillItem[] billItems = new BillItem[6];

		billItems[0] = new BillItem("Laptop", 12, 50000.00);
		billItems[1] = new BillItem("Mouse", 10, 500.00);
		billItems[2] = new BillItem("Monitor", 5, 5000.00);
		billItems[3] = new BillItem("Printer", 30, 510000.00);
		billItems[4] = new BillItem("Laptop", 7, 75000.00);
		billItems[5] = new BillItem("TV", 25, 60000.00);

		BillItem searchObject = new BillItem("Laptop", 12, 50000.00);
		Arrays.sort(billItems);
		System.out.println(Arrays.toString(billItems));

		int searchResult = search(billItems, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);
	}

}
