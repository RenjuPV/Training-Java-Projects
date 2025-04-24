package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main7 {
	public static void main(String[] args) {

		BillItem[] billItems = new BillItem[6];

		billItems[0] = new BillItem("Laptop", 12, 50000.00);
		billItems[1] = new BillItem("Mouse", 10, 500.00);
		billItems[2] = new BillItem("Monitor", 5, 5000.00);
		billItems[3] = new BillItem("Printer", 30, 510000.00);
		billItems[4] = new BillItem("Laptop", 7, 75000.00);
		billItems[5] = new BillItem("TV", 25, 60000.00);

		int n = billItems.length;
	
		BillItemQuantityComparator comparator = new BillItemQuantityComparator();

		for (int i = 1; i < n; ++i) {

			BillItem key = billItems[i];
			int j = i - 1;
			int r = comparator.compare(billItems[j],key);
			while (j >= 0 && r >0) {

				billItems[j + 1] = billItems[j];
				j = j - 1;
				if (j >= 0)
					r = comparator.compare(billItems[j],key);
			}

			billItems[j + 1] = key;

		}

		System.out.println(Arrays.toString(billItems));
		billItems = null;

	}

}
