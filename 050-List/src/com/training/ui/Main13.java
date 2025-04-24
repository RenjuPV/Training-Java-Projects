package com.training.ui;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.training.model.Circle;

public class Main13 {
	public static void main(String[] args) {
		
		List<Circle>circles=new LinkedList<>();
		
		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(30));
		circles.add(new Circle(40));
		Iterator<Circle>itr=circles.iterator();
		while(itr.hasNext()) {
			Circle c=itr.next();
			System.out.println(c);
		}
		
		
		System.out.println("--------------------------");
		ListIterator<Circle>itr1=circles.listIterator();//listIterator can traverse in both direction
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("--------------------------");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}
