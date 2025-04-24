package com.training.dp;

public class UniversityStudentAdapter implements Student {

	UniversityStudent us;

	public UniversityStudentAdapter(UniversityStudent us) {
		super();
		this.us = us;
	}

	@Override
	public String getName() {

		return us.getStudentName();
	}

	@Override
	public String getSurName() {
		return us.getStudentSurName();
	}

	@Override
	public String getEmail() {
		return us.getStudentContact();
	}

	@Override
	public String toString() {
		return "UniversityStudentAdapter [us=" + us + "]";
	}
	
	

}
