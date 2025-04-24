package com.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main04 {

	public static void main(String[] args) {

		OutputStream os = null;
		try {
			os = new FileOutputStream("welcome.txt");
		} catch (FileNotFoundException e) {

			// e.printStackTrace();
			System.err.println("Some errors occurs while creating welcome.txt ");
			System.exit(0);
		}
		String str = "I am fine....\nHope you are doing good";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			try {
				os.write(ch);
			} catch (IOException e) {
				System.err.println("Some Error while writing welcome.txt");
				// e.printStackTrace();
				System.exit(0);
			}
		}
		
		try {
			os.flush();
			os.close();
		} catch (IOException e) {
			System.err.println("Some Error closing the file welcome.txt");
			// e.printStackTrace();
			System.exit(0);
		}

	}

}
