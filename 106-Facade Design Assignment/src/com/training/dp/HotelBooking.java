package com.training.dp;

public class HotelBooking {

	public boolean roomsAvailable(int numberOfPersons) {
		if (numberOfPersons <= 50)
			return true;
		else
			return false;
	}

	public String bookRooms(int numberOfPersons, int numOfDays) {
		System.out.println("2 persons in a room");
		System.out.println(numberOfPersons / 2 + " rooms booked");
		System.out.println("stay for " + numOfDays + " days");
		return "SUCCESS BOOKING";
	}

	public double chargeForbooking() {
		System.out.println("Rs.2000/room for 1 day");
		return 2000.00;
	}

}
