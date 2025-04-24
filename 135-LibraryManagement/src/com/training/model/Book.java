package com.training.model;

public class Book {
	
	String bookName;
	String author;
	int noOfPages;
	boolean issuedStatus;
	
	public Book() {
		super();
	}

	
	public Book(String bookName, String author, int noOfPages, boolean issuedStatus) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.issuedStatus = issuedStatus;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	
	public boolean isIssuedStatus() {
		return issuedStatus;
	}


	public void setIssuedStatus(boolean issuedStatus) {
		this.issuedStatus = issuedStatus;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", noOfPages=" + noOfPages + ", issuedStatus="
				+ issuedStatus + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}


	

}
