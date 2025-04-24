package com.training.ui;

import java.util.Arrays;


import com.training.model.Square;

public class Main4 {

	public static void main(String[] args) {
		
		Square[] squares=new Square[6];
		
		
		squares[0]=new Square(55);
		squares[1]=new Square(5);
		squares[2]=new Square(2);
		squares[3]=new Square(30);
		squares[4]=new Square(66);
		squares[5]=new Square(13);
		
		for (int i = 0; i < squares.length; i++) {

			for (int j = 0; j < squares.length - i - 1; j++) {
				
				int r=squares[j].compareTo(squares[j + 1]);
				
				if (r > 0) {
					Square temp;
					temp = squares[j];
					squares[j] = squares[j + 1];
					squares[j + 1] = temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(squares));
		squares=null;


	}

}
