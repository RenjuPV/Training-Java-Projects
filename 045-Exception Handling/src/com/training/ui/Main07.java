package com.training.ui;

public class Main07 {

	public static void main(String[] args) {
		System.out.println("Program begins....");
		try {
			System.out.println(100 / 0);
			int[] arr = { 1, 2, 5, 6 };
			System.out.println(arr[5]);
			String str = "125abc";
			int x = Integer.parseInt(str);
			String str1 = null;
			System.out.println(str.length());

		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			System.out.println("Thank you");
		}

	}

}
