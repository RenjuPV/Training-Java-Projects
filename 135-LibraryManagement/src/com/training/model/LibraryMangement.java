package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class LibraryMangement {

	List<Book> allBooks;

	public LibraryMangement() {
		super();
		this.allBooks = new LinkedList<>();

		Book book1 = new Book("Aadujeevitham", "Benyamin", 500, false);
		Book book2 = new Book("Randamoozham", "M.T.Vasudevan", 500, false);
		Book book3 = new Book("Chemmen", "Thakazhi", 300, false);
		Book book4 = new Book("Balyakalasakhi", "Vaikom muhammad", 400, false);
		Book book5 = new Book("Ente kadha", "Madhavikutty", 250, false);
		Book book6 = new Book("Kayar", "Thakazhi", 300, false);
		Book book7 = new Book("Khasakkinte Ithihasam", "O V Vijayan", 250, false);
		Book book8 = new Book("Gold of Small Things", "Arundhathi Roy", 300, false);
		Book book9 = new Book("Pathummayude Aadu", "Vaikom Muhammed ", 150, false);
		Book book10 = new Book("Verukal", "Malayattor", 100, false);
		allBooks.add(book10);
		allBooks.add(book9);
		allBooks.add(book8);
		allBooks.add(book7);
		allBooks.add(book6);
		allBooks.add(book5);
		allBooks.add(book4);
		allBooks.add(book3);
		allBooks.add(book2);
		allBooks.add(book1);

	}
	
	

	public void issueBook(String bookName) {
		for (Book book : allBooks) {
			if (book.bookName.equals(bookName) && book.issuedStatus == false) {
				book.setIssuedStatus(true);
				System.out.println("-----------------------------");
				System.out.println("Book "+bookName +" is issued");
				System.out.println("------------------------------");

			}
		}
	}

	public void printAvailableBooks() {
		System.out.println("Available Books");
		System.out.println("----------------");
		for (Book book : allBooks) {
			if (book.issuedStatus == false) {
				System.out.println(book);

			}
		}
	}

	public int getAvailableBookCount() {

		int count = 0;
		for (Book book : allBooks) {
			if (book.issuedStatus == false) {
				count++;

			}
		}
		return count;
	}

	public int getIssuedBookCount() {
		int count = 0;
		for (Book book : allBooks) {
			if (book.issuedStatus == true) {
				count++;

			}
		}
		return count;
	}

}
