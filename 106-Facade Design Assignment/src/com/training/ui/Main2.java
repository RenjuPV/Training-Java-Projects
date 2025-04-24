package com.training.ui;

import com.training.dp.TourArrangementFacade;

public class Main2 {
	public static void main(String[] args) {

		TourArrangementFacade bookingFacade = new TourArrangementFacade();
		bookingFacade.arrangeTour(10,2);
	}

}
