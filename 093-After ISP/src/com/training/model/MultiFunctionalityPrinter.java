package com.training.model;

public class MultiFunctionalityPrinter implements  Printer,Fax,Scanner{

	@Override
	public void faxDocument() {
	System.out.println("Fax the document");
		
	}

	@Override
	public void printDocument() {
		System.out.println("Print the document");
		
	}

	@Override
	public void scanDocument() {
		System.out.println("Scan the document");
	}

}
