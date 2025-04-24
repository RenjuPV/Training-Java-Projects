package com.training.task;

import com.training.model.Hospital;

public class OPTicketCancelingTask implements Runnable{
	
	Hospital hospital;

	
	
	public OPTicketCancelingTask(Hospital hospital) {
		super();
		this.hospital = hospital;
	}



	@Override
	public void run() {
		
		hospital.cancelOpTicket(20);
		
	}

}
