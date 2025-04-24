package com.training.ui;

import com.training.model.Printer;
import com.training.model.SimplePrinter;

public class Main {
	
	public static void main(String[] args) {
		Printer printer=new SimplePrinter();
		printer.printDocument();
		printer.scanDocument();
		printer.faxDocument();
	}

}
