package com.training.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main09 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		System.out.println("Enter your name : ");
		String str = br.readLine();
		System.out.println(str);

		System.out.println("Enter your age : ");
		str = br.readLine();
		int age = Integer.parseInt(str);
		System.out.println(age);

		System.out.println("Enter your salary : ");
		str = br.readLine();
		double salary = Double.parseDouble(str);
		System.out.println(salary);

	}

}
