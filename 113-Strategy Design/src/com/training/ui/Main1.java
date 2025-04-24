package com.training.ui;

import java.util.Arrays;

import com.training.model.BubbleSortStrategy;
import com.training.model.InsertionSortStrategy;
import com.training.model.SelectionSortStrategy;
import com.training.model.SortingContext;

public class Main1 {

	public static void main(String[] args) {
		
		SortingContext sortingContext=new SortingContext(new BubbleSortStrategy());
		
		int[] array1= {5,2,9,1,5};
		sortingContext.performSort(array1);
		System.out.println(Arrays.toString(array1));
		
		sortingContext=new SortingContext(new InsertionSortStrategy());
		sortingContext.performSort(array1);
		System.out.println(Arrays.toString(array1));
		
		
		sortingContext=new SortingContext(new SelectionSortStrategy());
		sortingContext.performSort(array1);
		System.out.println(Arrays.toString(array1));
		
		
		
	}
}
