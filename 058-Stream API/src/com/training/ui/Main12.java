package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Circle;

public class Main12 {
	
	public static void main(String[] args) {
		
		List<Circle>circles=new LinkedList<>();
		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(130));
		circles.add(new Circle(40));
		circles.add(new Circle(150));
		
		boolean result1=circles
				.stream()
				.anyMatch(r->r.getRadius()>10);
			System.out.println(result1);
			
			
			
		/*	boolean result4=circles
					.stream()
					.anyMatch(r->r.equals(new Circle(10)));
				System.out.println("Test1:"+result4); */
			
			boolean result2=circles
					.stream()
					.allMatch(r->r.getRadius()>2);
				System.out.println(result2);
				
				
				
			boolean result3=circles
					.stream()
					.noneMatch(r->r.getRadius()==0);
					System.out.println(result3);
					
					
					boolean result5=circles
							.stream()
							.anyMatch(r->r.equals(new Circle(0)));
						System.out.println("Test:"+result5);
		
	}

}
