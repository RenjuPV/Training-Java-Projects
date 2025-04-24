package com.training.dp;

public class SchoolStudentadapter implements Student {

	SchoolStudent ss;

	public SchoolStudentadapter(SchoolStudent ss) {
		super();
		this.ss = ss;
	}

	@Override
	public String getName() {

		return ss.getStudentName();
	}

	@Override
	public String getSurName() {
		return ss.getStudentSurName();
	}

	@Override
	public String getEmail() {
		return ss.getStudentEmail();
	}

	@Override
	public String toString() {
		return "SchoolStudentadapter [ss=" + ss + "]";
	}
	
	

}
