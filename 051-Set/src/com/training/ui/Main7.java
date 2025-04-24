package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	
	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		set.add("Anju");
		set.add("Renju");
		set.add("Renju");
		set.add("Anila");
		set.add("Nimisha");
		set.add("Anju");

		for (String i : set) {
			System.out.println(i);
		}
		System.out.println("If set contains 'Anju' "+set.contains("Anju"));

		set.remove("Renju");
		System.out.println(set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String c = it.next();
			System.out.println(c.toUpperCase());
		}
	
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());

	}

}
