package com.training.ui;

import com.training.model.Square;

public class Main4 {

	private static int search(Square[] arr, Square searchData) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(searchData))
				return i;
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


		Square searchObject = new Square(200);
		int searchResult = search(squares, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);

	}
	
}

