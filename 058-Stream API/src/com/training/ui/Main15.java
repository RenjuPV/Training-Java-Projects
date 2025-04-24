package com.training.ui;

import java.util.LinkedList;
import java.util.List;


import com.training.model.BillItem;

public class Main15 {

	public static void main(String[] args) {

		List<BillItem> billItemsList = new LinkedList<>();

		billItemsList.add(new BillItem("Redmi", 2, 10000.00));
		billItemsList.add(new BillItem("Iphone", 5, 20000.00));
		billItemsList.add(new BillItem("OPPO", 2, 20000.00));
		billItemsList.add(new BillItem("Dell", 5, 40000.00));
		billItemsList.add(new BillItem("Redmi", 2, 15000.00));
		
		double r=billItemsList
				.stream()
				.map(bi->bi.getItemValue())
				.reduce(0.0, (b1,b2)->b1+b2);
		System.out.println(r);

	}

}
