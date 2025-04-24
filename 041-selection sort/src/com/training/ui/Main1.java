package com.training.ui;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		int[] arr = { 12, 19, 55, 2, 16 };
		int n = arr.length;
		int iMin;

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[iMin])
					iMin = j;
			}
			
			int temp;
			temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}

}
