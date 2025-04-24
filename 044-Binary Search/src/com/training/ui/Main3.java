package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {

	public static int search(Circle[] arr, Circle searchData) {

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

		Circle[] circles = new Circle[5];

		circles[0] = new Circle(10);
		circles[1] = new Circle(5);
		circles[2] = new Circle(15);
		circles[3] = new Circle(25);
		circles[4] = new Circle(7);

		Circle searchObject = new Circle(20);
		Arrays.sort(circles);
		System.out.println("Arrays after sort :"+Arrays.toString(circles));
		
		int searchResult = search(circles, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);

	}

}
