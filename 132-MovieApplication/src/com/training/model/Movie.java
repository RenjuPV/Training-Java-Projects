package com.training.model;

import java.util.HashSet;
import java.util.Set;

public class Movie {
	
	int id;
	String name;
	Set<Booking>allBooking;
	
	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.allBooking = new HashSet<>();
	}
	
	public Movie() {
		super();
		this.allBooking=new HashSet<>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Booking> getAllBooking() {
		return allBooking;
	}
	public void setAllBooking(Set<Booking> allBooking) {
		this.allBooking = allBooking;
	}
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", allBooking=" + allBooking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public void addBooking(Booking booking) {
		this.allBooking.add(booking);
	}
	
	public void cancelBooking(Booking booking) {
		this.allBooking.remove(booking);
	}

}
