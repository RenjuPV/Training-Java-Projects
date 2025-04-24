package com.training.ui;

import java.io.IOException;

import com.training.model.EmailSender;
import com.training.model.SMSSender;
import com.training.model.StoringUserToFile;
import com.training.model.User;
import com.training.model.WhatsAppNotification;

public class Main1 {
	
	public static void main(String[] args) {
		
		User user=new User("Renju", "renju@gmail.com", "949798") ;
		
		EmailSender emailSender=new EmailSender();
		emailSender.sendEmail(user);
		
		SMSSender smsSender=new SMSSender();
		smsSender.sendSMS(user);
		
		StoringUserToFile storingUserToFile=new StoringUserToFile();
		try {
			storingUserToFile.saveUser(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WhatsAppNotification whatsAppNotification=new WhatsAppNotification();
		whatsAppNotification.sendWhatsAppNotification(user);
		
		
	}

}
