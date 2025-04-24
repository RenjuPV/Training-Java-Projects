package com.training.model;

public class InsertionSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] arr) {
		System.out.println(" Insertion sort strategy used");
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

	}

}
