package com.training.ui;

import java.util.function.Predicate;

import com.training.model.Circle;
import com.training.model.Course;
import com.training.model.Department;
import com.training.model.Square;

public class Main3 {

	static void process1(Predicate<Circle> predicate) {

		Circle c = new Circle(20);
		System.out.println(predicate.test(c));
	}

	static void process2(Predicate<Square> predicate) {

		Square square = new Square(20);
		System.out.println(predicate.test(square));
	}

	static void process3(Predicate<Department> predicate) {

		Department department = new Department("IT", "Kiran");
		department.addEmployee(101, "Anju", "Female", "Kottayam", 10000.0);
		department.addEmployee(102, "Renju", "Female", "Kochi", 20000.0);
		department.addEmployee(103, "Manju", "Female", "Mumbai", 30000.0);
		department.addEmployee(104, "Sanju", "Female", "Chennai", 40000.0);

		System.out.println(predicate.test(department));
	}
	
	static void process4(Predicate<Course> predicate) {

		Course course = new Course("Diplomain web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 1000.00);
		course.addCourseItem("Angular", 50, 4000.00);

		System.out.println(predicate.test(course));
	}

	public static void main(String[] args) {

		process1(circle -> circle.getRadius() >= 10);

		process2(s -> s.getSize() >= 50);

		process3(d -> d.getEmployees().size() >= 10);
		
		process4(course -> course.getCourseItems().size() >= 3);

	}

}
