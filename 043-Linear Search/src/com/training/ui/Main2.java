package com.training.ui;

public class Main2 {
	
	private static int search(double[] arr, double searchData) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchData)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {

		double[] arr = { 70.00, 36.66, 12.75, 48.50, 52.00};
		double searchData = 36;
		int searchResult = search(arr, searchData);
		if (searchResult == -1)
			System.out.println("The search data " + searchData + " is not present and search result is : "+searchResult);
		else
			System.out.println("The search data " + searchData + " is present at position : " + searchResult);

	}

}
