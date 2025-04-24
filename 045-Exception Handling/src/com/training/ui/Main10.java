package com.training.ui;

import com.training.model.Student;

public class Main10 {
	public static void main(String[] args) throws Exception {

		System.out.println("Program begins");
		Student student = new Student();
		// try {
		// student.setMark(-99);
		// } catch (RuntimeException e) {
		// System.out.println(e.getMessage());
		// }

		student.setName("Renju");

		student.setGrade('A');
		System.out.println("Program ends");

	}
}
