package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main5 {
	
	public static void main(String[] args) {
		
		Set<BillItem> billItemsSet=new HashSet<>();
		
		billItemsSet.add(new BillItem("Redmi", 10, 1000.00));
		billItemsSet.add(new BillItem("Iphone", 5, 100000.00));
		billItemsSet.add(new BillItem("OPPO", 2, 200.00));
		billItemsSet.add(new BillItem("Dell", 8, 40000.00));
		billItemsSet.add(new BillItem("Redmi", 5, 15000.00));
		
		System.out.println("Size "+billItemsSet.size());
		System.out.println(billItemsSet);
		
		
		BillItem searcBillItem=new BillItem("OPPO",2,100.00);
		System.out.println(billItemsSet.contains(searcBillItem));
		
		billItemsSet.remove(new BillItem("Redmi", 0, 0));
		System.out.println(billItemsSet);
		
		Iterator<BillItem>it=billItemsSet.iterator();
		double total=0.0;
		while(it.hasNext()) {
			BillItem b=it.next();
			total=total+b.getItemValue();
		}
		System.out.println("Total = "+total);
		
		BillItemPriceComparator comparator=new BillItemPriceComparator();
		BillItem lowestPriceBillItem=new BillItem("Redmi",0,1000);
		for(BillItem b:billItemsSet) {
			int r=comparator.compare(b, lowestPriceBillItem);
			if(r<0)
				lowestPriceBillItem=b;
			
		}
		System.out.println(lowestPriceBillItem);
		billItemsSet.clear();
		System.out.println(billItemsSet.isEmpty());
		
	}

}
