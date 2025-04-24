package com.training.ui;

import com.training.dp.BookingFacade;
import com.training.dp.User;

public class Main2 {
	
	public static void main(String[] args) {
		
		User user=new User("Kiran", "kiran@gamil.com", "7855534433");
		
		BookingFacade bookingFacade=new BookingFacade();
		bookingFacade.creatBooking(user);
		
	}
	

}
