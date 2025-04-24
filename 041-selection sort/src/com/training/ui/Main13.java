package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Person;

public class Main13 {

	public static void main(String[] args) {
		
		Person[] persons = new Person[6];

		persons[0] = new Person("Renju", 34);
		persons[1] = new Person("Anju", 35);
		persons[2] = new Person("Anjali", 25);
		persons[3] = new Person("Shyama", 12);
		persons[4] = new Person("Suja", 55);
		persons[5] = new Person("Anila", 60);
		
		int n = persons.length;
		int iMin;

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {

				int r = persons[j].compareTo(persons[iMin]);

				if (r < 0)
					iMin = j;
			}

			Person temp;
			temp = persons[i];
			persons[i] = persons[iMin];
			persons[iMin] = temp;

		}

		System.out.println(Arrays.toString(persons));
		persons = null;


	}

}
