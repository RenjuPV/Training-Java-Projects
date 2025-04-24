package com.training.ui;

import com.training.model.Hospital;
import com.training.task.OPTicketBookingTask;
import com.training.task.OPTicketCancelingTask;


public class Main6 {
	
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		Runnable runnable1=new OPTicketBookingTask(hospital);
		Runnable runnable2=new OPTicketCancelingTask(hospital);
		
		Thread t1=new Thread(runnable1,"OPTBT");
		Thread t2=new Thread(runnable2,"OPTCT");
		t1.start();
		t2.start();
		
		
	}

}
