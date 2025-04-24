package com.training.dp;

public class BookingFacade {
	
	public void creatBooking(User user) {
		
		TicketSystem ts=new TicketSystem();
		PaymentSystem ps=new PaymentSystem();
		NotificationSystem ns=new NotificationSystem();
		
		boolean isBookingAvailable=ts.validateAvailability("movie");
		if(isBookingAvailable) {
			ts.createTicket(101, user, "movie");
			ps.chargeCard();
			ns.sendEmail(user, ts.getTicketNumber());
			ns.sendSMS(user, ts.getTicketNumber());
		}
		
	}

}
