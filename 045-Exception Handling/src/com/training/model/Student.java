package com.training.model;

public class Student {
	private int mark;
	private String name;
	private char grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {

		if (mark < 0 | mark > 100) {
			//RuntimeException e = new RuntimeException("Incorrect mark " + mark);
			InvalidMarkException e=new InvalidMarkException();
			throw e;
		}

		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name.length() == 0) {
			//Exception ex = new Exception("Invalid name");
			InvalidNameExceptinn ex=new InvalidNameExceptinn();
			throw ex;
		}
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) throws Exception {
		if (grade != 'A' & grade != 'B') {
			//Exception e=new Exception("Invalid grade");
			InvalidGradeException e=new InvalidGradeException();
			
			throw e;
		}
			this.grade = grade;
	}

}
