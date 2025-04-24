package com.training.ui;

import java.io.IOException;

import com.training.model.User;

public class Main1 {
	
	public static void main(String[] args) {
		
		User user=new User("Renju", "renju@gmail.com", "949798") ;
		try {
			user.saveUser();
			user.sendEmail();
			user.sendEmail();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
