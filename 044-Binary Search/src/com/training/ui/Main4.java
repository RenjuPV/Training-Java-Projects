package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;
import com.training.model.Square;

public class Main4 {

	public static int search(Square[] arr, Square searchData) {

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

		Square[] squares = new Square[6];

		squares[0] = new Square(10);
		squares[1] = new Square(50);
		squares[2] = new Square(15);
		squares[3] = new Square(20);
		squares[4] = new Square(66);
		squares[5] = new Square(13);
		
		Arrays.sort(squares);
		System.out.println("Arrays after sort :"+Arrays.toString(squares));
		
		Square searchObject = new Square(150);
		int searchResult = search(squares, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);

	}

}
