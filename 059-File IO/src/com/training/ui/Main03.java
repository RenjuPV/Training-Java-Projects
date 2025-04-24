package com.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main03 {

	public static void main(String[] args) {

		InputStream is = null;
		try {
			is = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			System.err.println("hollo.txt File not found");
			// e.printStackTrace();
			System.exit(0);

		}

		while (true) {
			try {

				int i;
				i = is.read();
				if (i == -1)
					break;
				char ch = (char) i;
				System.out.println(ch);

			} catch (IOException e) {
				System.err.println("Some Error while reading...from file");
				// e.printStackTrace();
				System.exit(0);
			}

		}
		try {
			is.close();
		} catch (IOException e) {
			System.err.println("Some Error while reading...from file");
			// e.printStackTrace();
			System.exit(0);
		}

	}

}
