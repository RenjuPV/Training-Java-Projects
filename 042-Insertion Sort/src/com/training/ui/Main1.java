package com.training.ui;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		int[] arr = { 12, 19, 55, 2, 16 };
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int key = arr[i];
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
