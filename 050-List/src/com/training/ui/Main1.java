package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	
	public static void main(String[] args) {
		
		List<String>cities=new ArrayList<>();
		
		System.out.println(cities.size());
		System.out.println(cities.isEmpty());
		
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Pune");
		
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.isEmpty());
		
		cities.add(1,"Cochin");
		cities.add("Cochin");
		System.out.println(cities);
		
		System.out.println(cities.contains("Pune"));
		
		System.out.println(cities.get(0));
		System.out.println(cities.get(3));
		System.out.println(cities.get(cities.size()-1));
		
		cities.set(4, "Hyderabad");
		System.err.println(cities);
		
		System.out.println(cities.indexOf("Mumbai"));
		System.out.println(cities.indexOf("Kottayam"));
		
		System.out.println(cities.lastIndexOf("Cochin"));
		
		cities.remove(1);
		System.out.println(cities);
		
		cities.remove("Cochin");
		System.out.println(cities);
		
		cities.clear();
		System.out.println(cities);
		
		
		
		
		
		
		
	}

}
