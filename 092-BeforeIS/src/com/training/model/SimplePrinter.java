package com.training.model;

public class SimplePrinter implements Printer{

	@Override
	public void printDocument() {
		System.out.println("Printing the document");
		
	}

	@Override
	public void scanDocument() {
		
		System.out.println("Not supported");
	}

	@Override
	public void faxDocument() {
		System.out.println("Not supported");
		
	}

}
