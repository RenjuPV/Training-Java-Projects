package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;


public class Main10 {
	public static void main(String[] args) {

		BillItemPriceComparator comparator = new BillItemPriceComparator();

		Set<BillItem> billItemsSet = new TreeSet<>(comparator);

		billItemsSet.add(new BillItem("Redmi", 10, 10000.00));
		billItemsSet.add(new BillItem("Iphone", 5, 100000.00));
		billItemsSet.add(new BillItem("OPPO", 2, 20000.00));
		billItemsSet.add(new BillItem("Dell", 8, 40000.00));
		billItemsSet.add(new BillItem("Redmi", 5, 15000.00));

		System.out.println("Size " + billItemsSet.size());
		System.out.println(billItemsSet);

	}

}
