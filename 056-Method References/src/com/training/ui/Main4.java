package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class Main4 {
	
	public static void main(String[] args) {
		
		List<String>names=new LinkedList<>();
		names.add("Prabju");
		names.add("Sruthi Menon");
		names.add("Karthik");
		names.add("Arthi");
		
		
		Function<String, Integer>fn;
		//fn=(s)->s.length();
		fn=String::length;//method reference
		Integer r=fn.apply(names.get(1));
		System.out.println(r);
		
		
		Function<String, String>fn1;
		//fn1=(s)->s.toUpperCase();
		fn1=String::toUpperCase;//method reference
		String upperStr=fn1.apply(names.get(0));
		System.out.println(upperStr);
		
		
		
		
	}

}
