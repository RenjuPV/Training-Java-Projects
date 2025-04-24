package com.training.ui;

import java.util.Arrays;
import java.util.List;

import com.training.model.Circle;
import com.training.model.CourseItem;

public class Main2 {
	
	public static void main(String[]args) {
		
		List<Integer>ilist=Arrays.asList(3,2,1,4,5,8,7);
		System.out.println(ilist);
		
		List<Circle>clist=Arrays.asList(new Circle(10),new Circle(10),new Circle(10));
		System.out.println(clist);
		
		List<CourseItem>courseItems=Arrays.asList(new CourseItem("HTML", 45, 2500),new CourseItem("Java", 45, 5000),new CourseItem("Angular", 45, 3000));
		System.out.println(courseItems);
		
	}

}
