package com.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main04 {
	
	public static void main(String[] args) {

		
		List<String>cities=new LinkedList<>();
		
		System.out.println(cities.size());
		System.out.println(cities.isEmpty());
		
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Pune");
		
		for(int i=0;i<cities.size();i++) {
			String city=cities.get(i);
			System.out.println(city+","+city.toUpperCase());
		}
		
		System.out.println("-----------------------");
		
		for(String city:cities) {
			
			System.out.println(city+","+city.toLowerCase());
		}
		
		System.out.println("-----------------------");
		
		Iterator<String>it=cities.iterator();
		while(it.hasNext()) {
			String city=it.next();
			System.out.println(city+","+city.length());
		}
		
		System.out.println("-----------------------");
		
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
