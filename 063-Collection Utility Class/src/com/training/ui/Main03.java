package com.training.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main03 {
	
	public static void main(String[] args) {
		
		List<BillItem> blist=Arrays.asList(new BillItem("Laptop", 5, 10000),
				new BillItem("Printer", 10, 5000),new BillItem("Mouse", 5, 1000),new BillItem("Dell", 10, 50000));
		
		System.out.println("-------------------------");
		System.out.println("Billitems");
		System.out.println(blist);
		
		System.out.println("-------------------------");
		System.out.println("Sorted using Item name(uses compareto method)");
		Collections.sort(blist);
		System.out.println(blist);
		System.out.println("-------------------------");
		
		System.out.println("Sorting using Price Comparator : ");
		Collections.sort(blist,new BillItemPriceComparator());
		System.out.println(blist);
		
		
		System.out.println("---------------------------------------------------");
		BillItem minBillItem=Collections.min(blist,new BillItemPriceComparator());
		System.out.println("Minimum Billitem : ");
		System.out.println(minBillItem);
		
		
		System.out.println("---------------------------------------------------");
		BillItem maxBillItem=Collections.max(blist,new BillItemPriceComparator());
		System.out.println("Max Billitem : ");
		System.out.println(maxBillItem);
		
		
	}

}
