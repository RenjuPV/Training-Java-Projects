package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;


public class Main06 {

	public static void main(String[] args) {
		

		
		      Set<BillItem> billItemsSet=new TreeSet<>();
			
			billItemsSet.add(new BillItem("Redmi", 10, 10000.00));
			billItemsSet.add(new BillItem("Iphone", 5, 100000.00));
			billItemsSet.add(new BillItem("OPPO", 2, 20000.00));
			billItemsSet.add(new BillItem("Dell", 8, 40000.00));
			billItemsSet.add(new BillItem("Redmi", 5, 15000.00));
			
						
			billItemsSet
				.stream()
				.mapToInt(bi->bi.getQuantity())
				.forEach(q->System.out.println(q));
			
			System.out.println("--------------------------");
			
			billItemsSet
			.stream()
			.sorted(new BillItemPriceComparator())
			.forEach(bi->System.out.println(bi));
			
			
			System.out.println("--------------------------");
			
			billItemsSet
			.stream()
			.sorted(new BillItemQuantityComparator())
			.forEach(bi->System.out.println(bi));
			
			
			
	}

}
