package com.training.ui;

public class Main1 {
	private static int search(int[] arr, int searchData) {
		// position if found,
		// -1if not found
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchData)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 24, 36, 12, 48, 52 };
		int searchData = 36;
		int searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("The search data " + searchData + " is not present and search result is : "+searchResult);
		else
			System.out.println("The search data " + searchData + " is present at position : " + searchResult);

	}
}
