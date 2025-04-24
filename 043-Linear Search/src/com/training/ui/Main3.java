package com.training.ui;

import com.training.model.Circle;

public class Main3 {

	private static int search(Circle[] arr, Circle searchData) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(searchData))
				return i;
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
		int searchResult = search(circles, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);

	}

}
