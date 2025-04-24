package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.training.model.Circle;

public class Main01 {
	
	public static void main(String[] args) {
		
		List<Integer> iList=new LinkedList<>();
		
		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(10));
		iList.add(Integer.valueOf(150));
		iList.add(Integer.valueOf(180));
		iList.add(Integer.valueOf(140));
		
		//Consumer<Integer>printAction;
		//printAction=(i)->System.out.println(i);
		
		iList.forEach((i)->System.out.println(i));
		
		List<String>cities=new LinkedList<>();
		cities.add("Pune");
		cities.add("Patna");
		cities.add("Kolkata");
		cities.add("Cochin");
		
		
		Consumer<String> upperCaseAction;
		cities.forEach(s->System.out.println(s.toUpperCase()));
		
		
		cities.forEach(s->System.out.println(s+" : "+s.length()));
		
		List<Circle>circles=new LinkedList<>();
		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(30));
		circles.forEach(c->System.out.println(c.toString()));
		circles.forEach(c->System.out.println(c.getRadius()+","+c.getArea()));
		
		
		
		
		
		
		
		
	}

}
