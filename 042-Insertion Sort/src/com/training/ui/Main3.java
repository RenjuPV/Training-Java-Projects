package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {

	public static void main(String[] args) {

		Circle[] circles = new Circle[5];

		circles[0] = new Circle(10);
		circles[1] = new Circle(5);
		circles[2] = new Circle(15);
		circles[3] = new Circle(20);
		circles[4] = new Circle(7);

		int n = circles.length;

		for (int i = 1; i < n; i++) {

			Circle key = circles[i];
			int j = i - 1;

			int r = circles[j].compareTo(key);

			while (j >= 0 && r > 0) {

				circles[j + 1] = circles[j];
				j = j - 1;
				if (j >= 0)
					r = circles[j].compareTo(key);
			}

			circles[j + 1] = key;

		}

		System.out.println(Arrays.toString(circles));
		circles = null;

	}

}
