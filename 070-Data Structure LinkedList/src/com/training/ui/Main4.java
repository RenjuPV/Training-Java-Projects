package com.training.ui;

import com.training.ds.List;
import com.training.ds.SimpleListImpl;
import com.training.model.BillItem;

public class Main4 {

	public static void main(String[] args) {

		List<BillItem> bList;

		bList = new SimpleListImpl<>();

		try {
			bList.insert(new BillItem("Laptop", 5, 100000));
			bList.insert(new BillItem("Desktop", 2, 200000));
			bList.insert(new BillItem("Printer", 3, 10000));
			bList.insert(new BillItem("Mouse", 6, 1000));
			bList.insert(new BillItem("Keyboard", 5, 2000));

			bList.display();

			System.out.println("---------------------------------------------------");

			bList.insert(0, new BillItem("Dell", 5, 100000));

			bList.display();

			System.out.println("---------------------------------------------------");
			bList.insert(3, new BillItem("Dell test", 5, 100000));

			bList.display();
			
			System.out.println("---------------------------------------------------");

			BillItem billItem = bList.get(0);
			System.out.println("Data in position 0 " + billItem);

		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
