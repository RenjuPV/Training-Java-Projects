package com.training.ui;

import java.util.Arrays;

import com.training.model.Square;

public class Main4 {

	public static void main(String[] args) {

		Square[] squares = new Square[6];

		squares[0] = new Square(10);
		squares[1] = new Square(50);
		squares[2] = new Square(15);
		squares[3] = new Square(20);
		squares[4] = new Square(66);
		squares[5] = new Square(13);

		int n = squares.length;

		for (int i = 1; i < n; ++i) {

			Square key = squares[i];
			int j = i - 1;
			int r = squares[j].compareTo(key);
			
			while (j >= 0 && r > 0) {

				squares[j + 1] = squares[j];
				j = j - 1;
				if(j>=0)
				r = squares[j].compareTo(key);

			}

			squares[j + 1] = key;

		}

		System.out.println(Arrays.toString(squares));

	}

}
