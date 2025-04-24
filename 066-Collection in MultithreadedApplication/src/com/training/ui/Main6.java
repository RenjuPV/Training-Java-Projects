package com.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {

		List<Integer> ilist = new ArrayList<>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);

		Iterator<Integer> it = ilist.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			ilist.add(Integer.valueOf(20));

		}

		System.out.println(ilist);
	}

}
