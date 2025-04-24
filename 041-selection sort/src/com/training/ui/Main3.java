package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {

	public static void main(String[] args) {

		Circle[] circles = new Circle[4];

		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(15);

		circles[0] = c1;
		circles[1] = c2;
		circles[2] = c3;
		circles[3] = new Circle(30);

		int n = circles.length;
		int iMin;

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {
				
				int r=circles[j].compareTo(circles[iMin]);

				if (r < 0)
					iMin = j;
			}

			Circle temp;
			temp = circles[i];
			circles[i] = circles[iMin];
			circles[iMin] = temp;

		}

		System.out.println(Arrays.toString(circles));
		circles=null;

	}

}
