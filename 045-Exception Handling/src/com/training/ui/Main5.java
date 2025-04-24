package com.training.ui;

public class Main5 {
	public static void main(String[] args) {
		System.out.println("Program begins....");
		try {
			System.out.println(100/0);
			int[] arr= {1,2,5,6};
			System.out.println(arr[5]);
			String str = "125abc";
			int x = Integer.parseInt(str);
			String str1= null;
			System.out.println(str.length());
			
		}catch (ArithmeticException e) {
			System.err.println("Division by zero is not possible");
			System.out.println("Continuing");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
			System.out.println("Continuing");
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Continuing");
			
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Continuing");
		}
		System.out.println("Program ends....");
	}

}
