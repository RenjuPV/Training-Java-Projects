package com.training.ui;

import java.util.Arrays;

import com.training.model.BillItem;


public class Main5 {

	public static void main(String[] args) {
		
		BillItem[] billItems = new BillItem[6];

		billItems[0] = new BillItem("Laptop", 12, 50000.00);
		billItems[1] = new BillItem("Mouse", 10, 500.00);
		billItems[2] = new BillItem("Monitor", 5, 5000.00);
		billItems[3] = new BillItem("Printer", 30, 510000.00);
		billItems[4] = new BillItem("Laptop", 7, 75000.00);
		billItems[5] = new BillItem("TV", 25, 60000.00);
		
		int n = billItems.length;
		int iMin;

		for (int i = 0; i < n - 1; i++) {

			iMin = i;

			for (int j = i + 1; j < n; j++) {

				int r = billItems[j].compareTo(billItems[iMin]);

				if (r < 0)
					iMin = j;
			}

			BillItem temp;
			temp = billItems[i];
			billItems[i] = billItems[iMin];
			billItems[iMin] = temp;

		}

		System.out.println(Arrays.toString(billItems));
		billItems = null;

	}

}
