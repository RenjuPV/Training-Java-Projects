package com.training.ui;

import java.util.Arrays;

import com.training.model.Circle;

public class Main3 {

	public static void main(String[] args) {
		
		Circle[]circles=new Circle[4];
		
		Circle c1=new Circle(10);
		Circle c2=new Circle(5);
		Circle c3=new Circle(15);
		
		circles[0]=c1;
		circles[1]=c2;
		circles[2]=c3;
		circles[3]=new Circle(30);
		
		for (int i = 0; i < circles.length; i++) {

			for (int j = 0; j < circles.length - i - 1; j++) {
				
				int r=circles[j].compareTo(circles[j + 1]);
				
				if (r > 0) {
					Circle temp;
					temp = circles[j];
					circles[j] = circles[j + 1];
					circles[j + 1] = temp;
				}

			}
		}
		
		System.out.println(Arrays.toString(circles));

	}

		
		
		

	}


