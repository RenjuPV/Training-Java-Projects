package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Account;
import com.training.model.BillItem;

public class BillItemPriceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		BillItem billItem1 = (BillItem) o1;
		BillItem billItem2 = (BillItem) o2;
		
		if (billItem1.getPrice() < billItem2.getPrice())
			return -1;
		if (billItem1.getPrice() > billItem2.getPrice())
			return 1;

		return 0;
	}

}
