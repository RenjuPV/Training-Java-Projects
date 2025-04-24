package com.training.ui;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.training.model.Booking;
import com.training.model.CommonData;
import com.training.model.Movie;
import com.training.model.Person;

public class Main {

	static List<Movie> movies = CommonData.movies;
	static List<Person> persons = CommonData.persons;

	public static void main(String[] args) {
		CommonData.init();
		bookTicket(4, 2);
		bookTicket(4, 3);
		bookTicket(4, 1);

		printBooking();
		cancelTicket(4, 1);
		printBooking();
	}

	public static void bookTicket(int movieIndex, int personIndex) {

		Booking booking = new Booking((int) (Math.random() * 100), movies.get(movieIndex), persons.get(personIndex),
				LocalDate.of(2025, 05, 01), false);
		CommonData.bookings.add(booking);
		movies.get(movieIndex).addBooking(booking);
	}

	public static void printBooking() {

		for (Movie movie : movies) {
			System.out.print(movie.getName());
			for (Booking booking : movie.getAllBooking()) {
				System.out.print("\t\t" + booking.getPerson().getName());
			}
			System.out.println();
		}

	}

	public static void cancelTicket(int movieIndex, int personIndex) {

		Movie movie = movies.get(movieIndex);
		Person person = persons.get(personIndex);

		Iterator<Booking> iterator = movie.getAllBooking().iterator();
		
		while (iterator.hasNext()) {
			Booking booking = iterator.next();
			if (booking.getPerson().equals(person) && booking.getMovie().equals(movie)) {
				
				iterator.remove();
				movies.get(movieIndex).cancelBooking(booking);
			}

		}

	}

}
