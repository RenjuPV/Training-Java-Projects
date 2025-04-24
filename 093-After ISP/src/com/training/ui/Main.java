package com.training.ui;

import com.training.model.MultiFunctionalityPrinter;
import com.training.model.Printer;
import com.training.model.SimplePrinter;

public class Main {
	
	public static void main(String[] args) {
		
		Printer printer=new SimplePrinter();
		printer.printDocument();
		
		MultiFunctionalityPrinter printer2=new MultiFunctionalityPrinter();
		printer2.printDocument();
		printer2.faxDocument();
		printer2.scanDocument();
	}

}
