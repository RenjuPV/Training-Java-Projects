package com.trining.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.test.Course;

public class CourseTesting {


	Course course;

	@BeforeEach
	public void setup() {
		course = new Course();
	}

	@AfterEach
	public void tear() {
		course = null;
	}

	@Test
	@DisplayName("Testing getCourseItemsCount")
	public void getCourseItemsCountTesting() {
		course.setCourseCode("101");
		course.setCourseName("MCA");
		course.addCourseItem("Java", 45, 4000);
		course.addCourseItem("php", 50, 4000);
		int expected = 2;
		int actual = this.course.getCourseItemsCount();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing getCourseTotalDuration")
	public void getCourseTotalDurationTesting() {
		course.setCourseCode("101");
		course.setCourseName("MCA");
		course.addCourseItem("Java", 45, 4000);
		course.addCourseItem("php", 50, 4000);
		int expected = 95;
		int actual = this.course.getCourseTotalDuration();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing getTotalFees")
	public void getTotalFeesTesting() {
		course.setCourseCode("101");
		course.setCourseName("MCA");
		course.addCourseItem("Java", 45, 4000);
		course.addCourseItem("php", 50, 4000);
		double expected = 8000;
		double actual = this.course.getTotalFees();
		assertEquals(expected, actual);
	}

}
