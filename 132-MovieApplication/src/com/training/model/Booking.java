package com.training.model;

import java.time.LocalDate;

public class Booking {
	
	int bookingId;
	Movie movie;
	Person person;
	LocalDate showDate;
	
	boolean cancelStatus;

	public Booking(int bookingId,Movie movie, Person person, LocalDate showDate, boolean cancelStatus) {
		super();
		this.bookingId=bookingId;
		this.movie = movie;
		this.person = person;
		this.showDate = showDate;
		this.cancelStatus = cancelStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public boolean isCancelStatus() {
		return cancelStatus;
	}

	public void setCancelStatus(boolean cancelStatus) {
		this.cancelStatus = cancelStatus;
	}


}
