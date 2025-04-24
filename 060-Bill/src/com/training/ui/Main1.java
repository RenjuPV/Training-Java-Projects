package com.training.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.Bill;
import com.training.model.CourseItem;
import com.training.util.ConsoleIO;

public class Main1 {

	public static void main(String[] args) throws IOException {

		int billNumber;
		String customerName;
		System.out.println("Enter Bill Number");
		billNumber = ConsoleIO.inputInt();

		System.out.println("Enter Customer Name");
		customerName = ConsoleIO.inputString();

		char anymore;
		Bill bill = new Bill(billNumber, customerName);
		do {

			String itemName;
			int quantity;
			double price;

			System.out.println("Enter Item Name");
			itemName = ConsoleIO.inputString();

			System.out.println("Enter Item Quantity");
			quantity = ConsoleIO.inputInt();

			System.out.println("Enter Item Price");
			price = ConsoleIO.inputDouble();

			bill.addBillItem(itemName, quantity, price);

			System.out.println("Add More Items ?: ");
			anymore = ConsoleIO.inputChar();
		} while (anymore == 'Y' || anymore == 'y');

		bill.printBill();
		
		try {

			OutputStream os = new FileOutputStream("bill.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(bill);
			oos.flush();
			oos.close();
			os.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		

	}

}
