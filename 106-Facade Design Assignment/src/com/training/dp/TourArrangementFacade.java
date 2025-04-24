package com.training.dp;

public class TourArrangementFacade {

	public void arrangeTour(int noOfPersons, int noOfDays) {

		HotelBooking hb = new HotelBooking();
		FoodArrangement fa = new FoodArrangement();
		TravelArrangements ta = new TravelArrangements();

		boolean roomsAvailable = hb.roomsAvailable(noOfPersons);

		if (roomsAvailable) {

			System.out.println(hb.bookRooms(noOfPersons, noOfDays));

			System.out.println("Total booking charge: " + hb.chargeForbooking());

			System.out.println("Food cost :" + fa.arrangeFood(noOfPersons));
			ta.arrange(noOfPersons);
		}

	}

}
