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
		for (int i = 1; i < n; ++i) {

			Person key = persons[i];
			int j = i - 1;
			int r = persons[j].compareTo(key);
			while (j >= 0 && r > 0) {

				persons[j + 1] = persons[j];
				j = j - 1;
				if (j >= 0)
					r = persons[j].compareTo(key);

			}

			persons[j + 1] = key;

		}

		System.out.println(Arrays.toString(persons));
		persons = null;


	}


}
