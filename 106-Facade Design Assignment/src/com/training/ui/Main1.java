package com.training.ui;

import com.training.dp.FoodArrangement;
import com.training.dp.HotelBooking;
import com.training.dp.TravelArrangements;

public class Main1 {

	public static void main(String[] args) {

		HotelBooking hb = new HotelBooking();

		boolean roomsAvailable = hb.roomsAvailable(10);

		if (roomsAvailable) {
			
			System.out.println(hb.bookRooms(10, 2));

			System.out.println("Total booking charge: " + hb.chargeForbooking());
			FoodArrangement fa = new FoodArrangement();

			System.out.println("Food cost :" + fa.arrangeFood(2));
			TravelArrangements ta = new TravelArrangements();
			ta.arrange(2);
		}

	}

}
