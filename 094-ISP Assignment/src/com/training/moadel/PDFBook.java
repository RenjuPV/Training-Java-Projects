package com.training.moadel;

public class PDFBook implements Book,MailableBook,PrintableBook {

	@Override
	public void printBook() {
		System.out.println("Printing the book");
		
	}

	@Override
	public void emailBook() {
		System.out.println("Email the book");
		
	}

	@Override
	public void readBook() {
		System.out.println("Reading the book");
		
	}

}
