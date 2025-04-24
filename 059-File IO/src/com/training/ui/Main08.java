package com.training.ui;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main08 {

	public static void main(String[] args) {

		String[] arr = { "Mumbai", "Delhi", "Bangalore" };

		OutputStream os = null;
		Writer writer = null;
		BufferedWriter bw = null;

		try {
			os = new FileOutputStream("cities.txt");
			writer = new OutputStreamWriter(os);
			bw = new BufferedWriter(writer);
		} catch (FileNotFoundException e) {
			System.out.println("Some Error while opening file");
			System.exit(0);

		}
		
		for(String city:arr) {
			try {
				bw.write(city+"\n");
			}catch (Exception e) {
				System.err.println("Some error while writing the file");
				System.exit(0);
			}
			
		}
		
		try {
			bw.flush();
			writer.close();
			bw.close();
			os.close();
			
		}catch (IOException e) {
			System.err.println("Some error while closing the file");
			System.exit(0);
		}

	}

}
