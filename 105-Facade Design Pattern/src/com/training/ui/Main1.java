package com.training.ui;

import com.training.dp.NotificationSystem;
import com.training.dp.PaymentSystem;
import com.training.dp.TicketSystem;
import com.training.dp.User;

public class Main1 {
	
	public static void main(String[] args) {
		User user=new User("Kiran", "9478899", "kiran@gamil.com");
		
		TicketSystem ts=new TicketSystem();
		boolean isBookingAvailable=ts.validateAvailability("movie");
		
		if(isBookingAvailable) {
			
			ts.createTicket(101, user, "movie");
			PaymentSystem ps=new PaymentSystem();
			ps.chargeCard();
			NotificationSystem ns=new NotificationSystem();
			ns.sendEmail(user, ts.getTicketNumber());
			ns.sendSMS(user, ts.getTicketNumber());
		}
		
	}

}
