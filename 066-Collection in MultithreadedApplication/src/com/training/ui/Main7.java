package com.training.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main7 {
	
	public static void main(String[] args) {

		List<Integer> ilist = new CopyOnWriteArrayList<>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);

		Iterator<Integer> it = ilist.iterator();//Fail safe
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			if(n==20)
			ilist.add(Integer.valueOf(20));

		}

		System.out.println(ilist);
		it=ilist.iterator();
		while(it.hasNext()) {
			Integer n=it.next();
			System.out.println(n);
		}
	}

}
