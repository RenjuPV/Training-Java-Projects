package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Person;
import com.training.model.comparators.PersonNameComparator;

public class Main14 {
	public static void main(String[] args) {

		Person[] persons = new Person[6];

		persons[0] = new Person("Renju", 34);
		persons[1] = new Person("Anju", 35);
		persons[2] = new Person("Anjali", 25);
		persons[3] = new Person("Shyama", 12);
		persons[4] = new Person("Suja", 55);
		persons[5] = new Person("Anila", 60);

		int n = persons.length;

		PersonNameComparator comparator = new PersonNameComparator();

		for (int i = 1; i < n; ++i) {

			Person key = persons[i];
			int j = i - 1;
			int r = comparator.compare(persons[j], key);
			while (j >= 0 && r > 0) {

				persons[j + 1] = persons[j];
				j = j - 1;
				if (j >= 0)
					r = comparator.compare(persons[j], key);
			}

			persons[j + 1] = key;

		}

		System.out.println(Arrays.toString(persons));
		persons = null;

	}

}
