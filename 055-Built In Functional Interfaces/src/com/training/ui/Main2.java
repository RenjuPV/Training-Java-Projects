package com.training.ui;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Course;
import com.training.model.CourseItem;
import com.training.model.Department;
import com.training.model.Employee;

public class Main2 {

	static void process(Consumer<Circle> c) {

		Circle circle = new Circle(10);
		c.accept(circle);
	}

	static void process1(Consumer<Department> c) {

		Department department = new Department("IT", "Kiran");
		department.addEmployee(101, "Anju", "Female", "Kottayam", 10000.0);
		department.addEmployee(102, "Renju", "Female", "Kochi", 20000.0);
		department.addEmployee(103, "Manju", "Female", "Mumbai", 30000.0);
		department.addEmployee(104, "Sanju", "Female", "Chennai", 40000.0);
		c.accept(department);

	}

	static void process2(Consumer<Course> c) {

		Course course = new Course("Diplomain web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 1000.00);
		course.addCourseItem("Angular", 50, 4000.00);
		c.accept(course);

	}

	static void process3(Consumer<Course> c) {

		Course course = new Course("Diplomain web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 1000.00);
		course.addCourseItem("Angular", 50, 4000.00);
		c.accept(course);

	}

	public static void main(String[] args) {

		Consumer<BillItem> consumer1;
		consumer1 = bi -> System.out.println(bi.getItemName() + "," + bi.getItemValue());
		consumer1.accept(new BillItem("Laptop", 5, 100000.00));

		Consumer<Department> consumer2;
		consumer2 = d -> System.out.println(d.getName() + "," + d.getManagerName());
		consumer2.accept(new Department("Accounts", "Meera"));

		Department department = new Department("IT", "Kiran");
		department.addEmployee(101, "Anju", "Female", "Kottayam", 10000.0);
		department.addEmployee(102, "Renju", "Female", "Kochi", 20000.0);
		department.addEmployee(103, "Manju", "Female", "Mumbai", 30000.0);
		department.addEmployee(104, "Sanju", "Female", "Chennai", 40000.0);

		Consumer<Department> consumer3;
		consumer3 = d -> {
			List<Employee> empList = d.getEmployees();
			double sum = 0 - 0;
			for (Employee e : empList) {
				sum = sum + e.getBasic();
			}
			System.out.println("Total Salary : " + sum);
		};
		consumer3.accept(department);

		Consumer<Department> consumer4;
		consumer4 = d -> d.printReport();
		consumer4.accept(department);

		System.out.println("***********************************************");

		Course course = new Course("Diplomain web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("CSS", 20, 3500.00);
		course.addCourseItem("jQuery", 35, 2500.00);
		course.addCourseItem("Knockout", 15, 1000.00);
		course.addCourseItem("Angular", 50, 4000.00);

		Consumer<Course> consumer5;
		consumer5 = c -> c.printCourseDetails();

		consumer5.accept(course);

		Consumer<Circle> consumer6;
		consumer6 = c -> System.out.println(c.getRadius() + "," + c.getArea());
		process(consumer6);// calling function process by passing anither function

		process(c -> System.out.println(c.getRadius() + "," + c.getArea()));

		// function as argument

		process1(d -> d.printReport());// functional Programming

		process2(crs -> crs.printCourseDetails());// functional Programming
		
		
		process3(crs->{
			
			Set<CourseItem> courseSet = crs.getCourseItems();
			int totDuration = 0;
			for (CourseItem c : courseSet) {
				totDuration += c.getDurationInHours();
			}
			System.out.println("Total Duration : " + totDuration);
			
		});

	}

}
