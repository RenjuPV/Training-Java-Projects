package com.training.dp;

public class UniversityStudent {
	
	String studentName;
	String studentSurName;
	String studentContact;
	
	@Override
	public String toString() {
		return "UniversityStudent [studentName=" + studentName + ", studentSurName=" + studentSurName
				+ ", studentContact=" + studentContact + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurName() {
		return studentSurName;
	}

	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public UniversityStudent() {
		super();
	}

	public UniversityStudent(String studentName, String studentSurName, String studentContact) {
		super();
		this.studentName = studentName;
		this.studentSurName = studentSurName;
		this.studentContact = studentContact;
	}
	
	
	

}
