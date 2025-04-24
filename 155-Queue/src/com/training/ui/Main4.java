package com.training.ui;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.training.model.Person;

public class Main4 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Person>persons;
		persons=new PriorityQueue<>(Comparator.reverseOrder());
		
		persons.add(new Person(30, 170, 65));
		persons.add(new Person(26, 160, 55));
		persons.add(new Person(33, 180, 75));
		persons.add(new Person(28, 165, 68));
		persons.add(new Person(34, 195, 90));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
	}

}
