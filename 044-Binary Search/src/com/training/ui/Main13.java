package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.Person;


public class Main13 {
	public static int search(Person[] arr, Person searchData) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = arr[mid].compareTo(searchData);
			if (r == 0)
				return mid;
			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		Person[] persons = new Person[6];

		persons[0] = new Person("Renju", 34);
		persons[1] = new Person("Anju", 35);
		persons[2] = new Person("Anjali", 25);
		persons[3] = new Person("Shyama", 12);
		persons[4] = new Person("Suja", 55);
		persons[5] = new Person("Anila", 60);

		Person searchObject = new Person("Renju", 25);

	
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));

		int searchResult = search(persons, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search data " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search data " + searchObject + " is present at position : " + searchResult);
	}

}
