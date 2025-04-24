package com.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main06 {

	public static void main(String[] args) {

		OutputStream os = null;
		Writer writer = null;
		try {
			os = new FileOutputStream("welcome1.txt");
			writer = new OutputStreamWriter(os);
		} catch (FileNotFoundException e) {
			System.err.println("Some problems while opening file");
			System.exit(0);
		}

		String str = "Java 8 has awesome features....\nFunctional Interfaces...\nLambda Expression\n Stream API\n Optional";

		try {

			writer.write(str);

		} catch (IOException e) {

			System.err.println("Some problems while writing");
			System.exit(0);
		}

		try {
			writer.flush();
			writer.close();
			os.close();
		} catch (IOException e) {
			System.err.println("Some Problem While Closing file");
			System.exit(0);
		}

	}

}
