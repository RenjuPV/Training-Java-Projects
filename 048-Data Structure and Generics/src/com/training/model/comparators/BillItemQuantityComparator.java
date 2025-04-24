package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.BillItem;

public class BillItemQuantityComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		BillItem billItem1 = (BillItem) o1;
		BillItem billItem2 = (BillItem) o2;
		
		if (billItem1.getQuantity() < billItem2.getQuantity())
			return -1;
		if (billItem1.getQuantity() > billItem2.getQuantity())
			return 1;

		return 0;
	}


}
