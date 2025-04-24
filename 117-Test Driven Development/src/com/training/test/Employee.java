package com.training.test;

public class Employee {
	char grade;

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int incentivePersentage() {
		if (grade == 'A')
			return 40;
		if (grade == 'B')
			return 30;
		if (grade == 'C')
			return 20;
		if (grade == 'D')
			return 10;

		return 0;
	}

}
