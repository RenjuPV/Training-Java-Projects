package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main6 {
	public static void main(String[] args) {

		BillItem[] billItems = new BillItem[6];

		billItems[0] = new BillItem("Laptop", 12, 50000.00);
		billItems[1] = new BillItem("Mouse", 10, 500.00);
		billItems[2] = new BillItem("Monitor", 5, 5000.00);
		billItems[3] = new BillItem("Printer", 30, 510000.00);
		billItems[4] = new BillItem("Laptop", 7, 75000.00);
		billItems[5] = new BillItem("TV", 25, 60000.00);
		
		BillItemPriceComparator comparator=new BillItemPriceComparator();

		for (int i = 0; i < billItems.length; i++) {

			for (int j = 0; j < billItems.length - i - 1; j++) {
				
			

				int r = comparator.compare(billItems[j],billItems[j + 1]);

				if (r > 0) {
					BillItem temp;
					temp = billItems[j];
					billItems[j] = billItems[j + 1];
					billItems[j + 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(billItems));
		billItems = null;

	}

}
