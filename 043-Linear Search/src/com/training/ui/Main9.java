package com.training.ui;

import java.util.Comparator;

import com.training.model.Person;

import com.training.model.comparators.PersonNameComparator;

public class Main9 {

	private static int search(Person[] arr, Person searchData) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(searchData))
				return i;
		}
		return -1;
	}

	private static int personAgeSearch(Person[] arr, Person searchObject) {

		for (int i = 0; i < arr.length; i++) {

			if (searchObject instanceof Comparable) {

				Comparable searchData = searchObject;
				int r = arr[i].compareTo(searchData);
				if (r == 0)
					return i;

			}
		}
		return -1;
	}

	private static int personNameSearch(Person[] arr, Person searchObject) {

		Comparator comparator = new PersonNameComparator();

		for (int i = 0; i < arr.length; i++) {

			int r = comparator.compare(arr[i], searchObject);

			if (r == 0)
				return i;

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

		int searchResult = search(persons, searchObject);
		if (searchResult == -1)
			System.out.println(
					"The search name " + searchObject + " is not present and search result is : " + searchResult);
		else
			System.out.println("The search name " + searchObject + " is present at position : " + searchResult);

		System.out.println("-------------------------------------------");

		int personAgeSearchResult = personAgeSearch(persons, searchObject);
		if (personAgeSearchResult == -1)
			System.out.println("The search age " + searchObject + " is not present and search result is : "
					+ personAgeSearchResult);
		else
			System.out.println("The search age " + searchObject + " is present at position : " + personAgeSearchResult);

		System.out.println("-------------------------------------------");

		int personNameSearchResult = personNameSearch(persons, searchObject);
		if (personNameSearchResult == -1)
			System.out.println("The search name" + searchObject + " is not present and search result is : "
					+ personNameSearchResult);
		else
			System.out
					.println("The search name " + searchObject + " is present at position : " + personNameSearchResult);
	}
}
