package com.training.test;

import java.util.HashSet;
import java.util.Set;

public class Course {
	String courseName;
	String courseCode;
	Set<CourseItem> courseItems = new HashSet<>();

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCourseItemsCount() {
		return courseItems.size();

	}

	public int getCourseTotalDuration() {

		return courseItems.stream().mapToInt(item -> item.getDuration()).sum();

	}

	public double getTotalFees() {

		return courseItems.stream().mapToDouble(item -> item.getFees()).sum();

	}

	public void addCourseItem(String courseItemName, int duration, double fees) {
		CourseItem item = new CourseItem(courseItemName, duration, fees);
		this.courseItems.add(item);
	}

}
