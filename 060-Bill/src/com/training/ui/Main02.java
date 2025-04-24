package com.training.ui;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.Bill;

public class Main02 {

	public static void main(String[] args) {
		Bill bill = null;
		try {

			InputStream is = new FileInputStream("bill.dat");
			ObjectInputStream ois = new ObjectInputStream(is);

			Bill b = (Bill) ois.readObject();
			System.out.println(b);
			b.printBill();
			ois.close();
			is.close();

		} catch (Exception e) {
			System.err.println(e);
			System.exit(0);
		}
	}
}
