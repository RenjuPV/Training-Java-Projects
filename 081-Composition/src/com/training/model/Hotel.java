package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class Hotel {

	private List<Room> roomList;
	private List<Guest> guests;
	private List<Stay> stayList;

	@Override
	public String toString() {
		return "\nHotel [roomList=" + roomList + ", guests=" + guests + ", stayList=" + stayList + "]";
	}

	public void addRoom(int maxGuests, int width, int length) {
		if (roomList == null)
			roomList = new LinkedList<>();
		roomList.add(new Room(maxGuests, width, length));
	}

	public void addGuest(Guest guest) {
		if (guests == null)
			guests = new LinkedList<>();
		guests.add(guest);
	}

	public void allocateRoom(Guest guest) {
		if (this.stayList == null)
			this.stayList = new LinkedList<Hotel.Stay>();
		Stay stay = new Stay(7, guest, roomList.get(0));
		this.stayList.add(stay);
	}

	/*
	 * public void orderFood(Guest guest,String itemName,int qty) {Stay
	 * this.stayList.get(0).foodOrders.add(new FoodOrder("Chapathi", 2)));
	 * 
	 * }
	 */

	private class Room {
		int maxGuests;
		int width;
		int length;

		public Room(int maxGuests, int width, int length) {
			super();
			this.maxGuests = maxGuests;
			this.width = width;
			this.length = length;
		}

		@Override
		public String toString() {
			return "\nRoom [maxGuests=" + maxGuests + ", width=" + width + ", length=" + length + "]";
		}
		
		

	}

	public class Stay {

		int numberOfDays;
		Guest guest;
		Room room;

		List<FoodOrder> foodOrders;

		private class FoodOrder {

			String itemName;
			int quantity;

			public FoodOrder(String itemName, int quantity) {
				super();
				this.itemName = itemName;
				this.quantity = quantity;
			}

		}

		public Stay(int numberOfDays, Guest guest, Room room) {
			super();
			this.numberOfDays = numberOfDays;
			this.guest = guest;
			this.room = room;
		}

		@Override
		public String toString() {
			return "\nStay [numberOfDays=" + numberOfDays + ", guest=" + guest + ", room=" + room + "]";
		}

	}

}
