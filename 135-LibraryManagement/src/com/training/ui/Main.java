package com.training.ui;

import com.training.model.LibraryMangement;

public class Main {
	
	public static void main(String[] args) {
		LibraryMangement mangement=new LibraryMangement();
		
		mangement.printAvailableBooks();
		
		mangement.issueBook("Kayar");
		mangement.printAvailableBooks();
		System.out.println("Issued Book count : "+mangement.getIssuedBookCount());
		System.out.println("Available Book count : "+mangement.getAvailableBookCount());
	}
	
	

}
