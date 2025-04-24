package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Circle;

public class Main07 {

	public static void main(String[] args) {

		List<Circle> circles = new LinkedList<>();

		Circle c1 = new Circle(20);

		circles.add(c1);
		circles.add(new Circle(20));
		circles.add(new Circle(40));
		circles.add(new Circle(50));
		circles.add(new Circle(87));

		System.out.println(circles);
		System.out.println(circles.contains(new Circle(40)));

		circles.set(1, new Circle(1000));
		circles.remove(new Circle(50));
		System.out.println(circles);

		Circle min = circles.get(0);
		Circle max = circles.get(0);

	/*	for (int i = 1; i < circles.size(); i++) {
			if (circles.get(i).getRadius() < min.getRadius())
				min = circles.get(i);

			if (circles.get(i).getRadius() > max.getRadius())
				max = circles.get(i);

		}
		
		System.out.println("Min circle :" + min);
		System.out.println("Max circle :" + min);
		System.out.println("----------------"); */

		for (Circle c : circles) {
			int r = c.compareTo(min);
			if (r < 0)
				min = c;
			r = c.compareTo(max);
			if (r > 0)
				max = c;
		}
		
		System.out.println("Min circle :" + min);
		System.out.println("Max circle :" + max);
		System.out.println("----------------");

	}

}
