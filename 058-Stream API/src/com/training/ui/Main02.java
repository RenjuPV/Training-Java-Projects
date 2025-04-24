package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Circle;

public class Main02 {

	public static void main(String[] args) {

		List<Integer> iList = new LinkedList<>();

		iList.add(Integer.valueOf(120));
		iList.add(Integer.valueOf(10));
		iList.add(Integer.valueOf(150));
		iList.add(Integer.valueOf(75));
		iList.add(Integer.valueOf(80));

		iList.stream().sorted().filter(i->i>=100).forEach(i -> System.out.println(i));
		
		
		List<String>cities=new LinkedList<>();
		cities.add("Pune");
		cities.add("Patna");
		cities.add("Kolkata");
		cities.add("Cochin");
		
		cities.stream().sorted().filter(c->c.length()>=6).forEach(c->System.out.println(c));
		
		
		List<Circle>circles=new LinkedList<>();
		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(130));
		circles.add(new Circle(40));
		circles.add(new Circle(150));
		circles.stream().sorted().filter(c->c.getRadius()>=100).forEach(c->System.out.println(c));
		
		

	}

}
