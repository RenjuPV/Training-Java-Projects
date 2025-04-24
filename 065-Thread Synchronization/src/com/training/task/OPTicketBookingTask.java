package com.training.task;

import com.training.model.Hospital;

public class OPTicketBookingTask implements Runnable{
	
	Hospital hospital;
	
	

	public OPTicketBookingTask(Hospital hospital) {
		super();
		this.hospital = hospital;
	}



	@Override
	public void run() {
	
		hospital.bookOpTicket(35);
	}

}
