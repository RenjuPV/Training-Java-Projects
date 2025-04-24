package com.training.ui;


import com.training.moadel.PDFBook;
import com.training.moadel.SimpleBook;

public class Main1 {
	
	public static void main(String[] args) {
		
		System.out.println("Simple Book");
		System.out.println("---------------");
		SimpleBook book=new SimpleBook();
		book.readBook();
		
		
		System.out.println("PDF Book");
		System.out.println("---------------");
		PDFBook pdfBook=new PDFBook();
		pdfBook.readBook();
		pdfBook.printBook();
		pdfBook.emailBook();
		
	}

}
