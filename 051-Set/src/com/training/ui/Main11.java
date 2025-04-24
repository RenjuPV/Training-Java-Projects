package com.training.ui;

import com.training.model.Bill;

public class Main11 {

	public static void main(String[] args) {
		
		Bill bill=new Bill(1066, "Mamatha kk");
		bill.addBillItem("Dell", 3, 50000.00);
		bill.addBillItem("IBM", 2, 55000.00);
		bill.addBillItem("Acer", 4, 49000.00);
		bill.addBillItem("HP", 1, 55000.00);
		
		bill.printBill();
		

	}

}
