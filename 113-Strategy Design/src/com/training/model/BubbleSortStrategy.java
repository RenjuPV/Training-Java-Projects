package com.training.model;

public class BubbleSortStrategy implements SortingStrategy {

	@Override
	public void sort(int[] array) {
		System.out.println("Bubble sort strategy used");
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
	}

}
