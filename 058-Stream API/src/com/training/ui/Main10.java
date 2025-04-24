package com.training.ui;

import com.training.model.Course;

public class Main10 {
	
	public static void main(String[] args) {
		
		Course course=new Course("Diploma in web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 4500.00);
		course.addCourseItem("Angular", 30, 4000.00);
		
		System.out.println(course.getLongestDurationCourseItem());
		System.out.println(course.getShortestDurationCourseItem());
		
		System.out.println(course.getHighestPriceCourseItem());
		System.out.println(course.getLowestPriceCourseItem());
		
		
		
	}

}
