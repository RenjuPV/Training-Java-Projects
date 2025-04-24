package com.training.ui;

import java.util.Arrays;

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

		PersonNameComparator comparator = new PersonNameComparator();
		
		for (int i = 0; i < persons.length; i++) {

			for (int j = 0; j < persons.length - i - 1; j++) {

				int r = comparator.compare(persons[j], persons[j + 1]);

				if (r > 0) {
					Person temp;
					temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(persons));
		persons = null;

	}

}
