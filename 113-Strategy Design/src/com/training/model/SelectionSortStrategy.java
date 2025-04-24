package com.training.model;

public class SelectionSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] arr) {
		System.out.println(" Selection sort strategy used");
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

	}

}
