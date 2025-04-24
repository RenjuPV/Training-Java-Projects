package com.training.ui;

import com.training.model.Course;

public class Main12 {
	public static void main(String[] args) {
		
		Course course=new Course("Diplomain web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 1000.00);
		course.addCourseItem("Angular", 50, 4000.00);
		course.printCourseDetails();
		
	}

}
