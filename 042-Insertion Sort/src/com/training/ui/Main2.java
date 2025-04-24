package com.training.ui;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {

		double[] arr = { 12.00, 19.5, 55.6, 2.1, 16.24 };
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			double key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;

		}

		System.out.println(Arrays.toString(arr));

	}

}
