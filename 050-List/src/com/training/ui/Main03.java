package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {

		List<Float> prices = new ArrayList<>();
		
		
		System.out.println("List : "+prices);
		System.out.println("List size: "+prices.size());
		System.out.println("list is empty : "+prices.isEmpty());
		
		prices.add(10.00f);
		prices.add(10.00f);
		prices.add(20.00f);
		prices.add(30.00f);
		
		prices.add(300.0f);
		prices.add(50.00f);
		prices.add(500.0f);
		prices.add(700.0f);
			
		
		System.out.println("List : "+prices);
		System.out.println("List size: "+prices.size());
		System.out.println("list is empty : "+prices.isEmpty());
		
		
		
		System.out.println(prices.contains(500.0f));
		
		System.out.println(prices.get(prices.size()-1));
		System.out.println(prices.get(0));
		
		
		
		System.out.println(prices.indexOf(700.0f));
		
		System.out.println(prices);
		prices.set(3, 400.f);
		System.out.println(prices);
		
		prices.remove(1);
		System.out.println(prices);
		
		prices.remove(Float.valueOf(300.0f));
		System.out.println(prices);
		
		
		prices.clear();
		System.out.println("List : "+prices);
		System.out.println("List size: "+prices.size());
		System.out.println("list is empty : "+prices.isEmpty());
		
		
		
	
	}

}
