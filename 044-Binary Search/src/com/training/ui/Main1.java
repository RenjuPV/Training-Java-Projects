package com.training.ui;

import java.util.Arrays;

public class Main1 {

	public static int search(int[] arr, int searchData) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == searchData)
				return mid;

			if (arr[mid] < searchData)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = {10,2, 4, 6, 8, 10, 11, 12 };
		
		System.out.println("Arrays before sort :"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays after sort :"+Arrays.toString(arr));
		
		int searchData = 2;
		int searchResult = search(arr, searchData);

		if (searchResult == -1)
			System.out.println(searchData + " is not present and search result is : " + searchResult);
		else
			System.out.println(searchData + " is  present at the position : " + searchResult);

	}
}
