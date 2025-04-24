package com.training.dp;

public class NotificationSystem {
	
	 public void sendEmail(User user,int ticketNumber) {
		 System.out.println("Sending Email to "+user.getName());
	 }
	 public void sendSMS(User user,int ticketNumber) {
		 System.out.println("Sending SMS to "+user.getName());
	 }

}
