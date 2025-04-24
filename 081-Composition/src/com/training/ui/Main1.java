package com.training.ui;

import com.training.model.Guest;
import com.training.model.Hotel;

public class Main1 {
	
	public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		hotel.addRoom(2, 20, 30);
		hotel.addRoom(4, 120, 180);
		hotel.addRoom(3, 40, 80);
		
		Guest guest1=new Guest("Renju", "Female", "9444", "Indian");
		hotel.addGuest(guest1);
		
		Guest guest2=new Guest("Anju", "Female", "94445555", "Indian");
		hotel.addGuest(guest2);
		
		Guest guest3=new Guest("Manju", "Female", "888888", "Indian");
		hotel.addGuest(guest2);
		
		
		hotel.allocateRoom(guest1);
		hotel.allocateRoom(guest2);
		hotel.allocateRoom(guest3);
		System.out.println(hotel);
		
		
		
		
		
	}

}
