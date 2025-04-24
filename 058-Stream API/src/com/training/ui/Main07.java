package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main07 {

	public static void main(String[] args) {

		List<Integer> iList = new LinkedList<>();

		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(10));
		iList.add(Integer.valueOf(150));
		iList.add(Integer.valueOf(180));
		iList.add(Integer.valueOf(140));
		iList.add(Integer.valueOf(800));
		iList.add(Integer.valueOf(750));
		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(330));
		iList.add(Integer.valueOf(450));

		iList
			.stream()
			.limit(5)
			.forEach(i->System.out.println(i));
		
		System.out.println("-------------------------------------");
		
		iList
			.stream()
			.distinct()
			.forEach(i->System.out.println(i));

	}

}
