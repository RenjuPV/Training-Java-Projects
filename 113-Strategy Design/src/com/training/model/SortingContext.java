package com.training.model;

public class SortingContext {
	SortingStrategy sortingStrategy;

	public SortingContext(SortingStrategy sortingStrategy) {
		super();
		this.sortingStrategy = sortingStrategy;
	}

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void performSort(int[] array) {
		sortingStrategy.sort(array);
	}

}
