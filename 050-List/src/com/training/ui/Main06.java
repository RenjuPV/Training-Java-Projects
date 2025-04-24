package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
	public static void main(String[] args) {

		List<Float> prices = new ArrayList<>();
		
		prices.add(66.6f);
		prices.add(21.5f);
		prices.add(19.2f);
		prices.add(22.8f);
		
		prices.add(70.60f);
		prices.add(90.0f);
		prices.add(199.00f);
		
		float min=prices.get(0);
		float max=prices.get(0);
		
		for(int i=1;i<prices.size();i++) {
			if(prices.get(i)<min)
				min=prices.get(i);
			
			if(prices.get(i)>max)
				max=prices.get(i);
			
		}
			
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
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
