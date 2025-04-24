package com.training.ui;

public class Main2 {
	
	static void printLength(String str) {
		try {
			System.out.println("Length of the string "+str+" is :"+str.length());
		}catch (NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Good bye");
		}
		
	}
	public static void main(String[] args) {
		String s1="Welcome";
		String s2=null;
		String s3="UST";
		printLength(s1);
		System.out.println("----------------------");
		printLength(s2);
		System.out.println("-----------------------");
		printLength(s3);
		
	}

}
