package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class CommonData {
	
	public static List<Movie>movies=new LinkedList<>();
	public static List<Person>persons=new LinkedList<>();
	public static List<Booking>bookings=new LinkedList<>();
	
	public static void init() {
		Movie movie1=new Movie(101, "Marco");
		Movie movie2=new Movie(102, "Niram");
		Movie movie3=new Movie(103, "Colors");
		Movie movie4=new Movie(104, "ThreeKings");
		Movie movie5=new Movie(105, "Pokkiri");
		
		Person person1=new Person(1, "Renju", "Female", 33);
		Person person2=new Person(2, "Anju", "Female", 34);
		Person person3=new Person(3, "Sanju", "Female", 30);
		Person person4=new Person(4, "Manju", "Female", 20);
		Person person5=new Person(5, "Malu", "Female", 22);
		
		movies.add(movie5);
		movies.add(movie4);
		movies.add(movie3);
		movies.add(movie2);
		movies.add(movie1);
		
		persons.add(person5);
		persons.add(person4);
		persons.add(person3);
		persons.add(person2);
		persons.add(person1);
		
		
		
		
	}

}
