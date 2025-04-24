package com.training.model;

public class Hospital {
	
	
	int opTicketCount=0;
	
	

	public synchronized void bookOpTicket(int ticketNo) {

		
		String tName = Thread.currentThread().getName();

		for (int i = 1; i <= ticketNo; i++) {
			this.opTicketCount++;
			if (this.opTicketCount >= 30) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(tName + " : Booking OP ticket" + this.opTicketCount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		System.out.println("Op ticket Booking completed with token "+ticketNo);
	}

	public synchronized void cancelOpTicket(int ticketNo) {

		
		String tName = Thread.currentThread().getName();

		for (int i = 1; i <= ticketNo; i++) {
			this.opTicketCount--;
			if (this.opTicketCount <= 10) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println(tName + " : Canceling opticket..." + this.opTicketCount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		System.out.println("OPTicket Canceling  completed with token no  "+ticketNo);
	}

}
