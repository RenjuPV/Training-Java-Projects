package com.training.ui;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		int[] arr = { 19, 12, 6, 13 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
