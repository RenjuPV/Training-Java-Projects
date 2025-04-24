package com.training.model;

import java.util.HashSet;
import java.util.Set;

public class Course {

	private String courseName;
	private Set<CourseItem>courseItems;
	
	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<CourseItem> getCourseItems() {
		return courseItems;
	}

	public void setCourseItems(Set<CourseItem> courseItems) {
		this.courseItems = courseItems;
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		this.courseItems=new HashSet<>();
	}
	
	public void addCourseItem(String subjectName,int duration,double fees) {
		CourseItem courseItem=new CourseItem(subjectName, duration, fees);
		this.courseItems.add(courseItem);
	}
	
	
	public void printCourseDetails() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Course Name : "+this.courseName);
	
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Slno          Subject Name       Duration            Fees");
		System.out.println("--------------------------------------------------------------------------");
		int slno=1;
		double total=0;
		for(CourseItem ci:this.courseItems) {
			System.out.printf("\n  %d %20s \t%3d \t\t%10.2f ",
					slno,ci.getSubjectName(),ci.getDurationInHours(),ci.getFees());
			
			total=total+ci.getFees();
			slno++;
		}
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("Total Fees  :"+total);
		System.out.println("----------------------------------------------------------------------------");
		
	

}
	
}
