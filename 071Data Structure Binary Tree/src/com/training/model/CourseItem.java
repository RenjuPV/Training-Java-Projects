package com.training.model;

public class CourseItem implements Comparable<CourseItem>{
	private String subjectName;
	private int durationInHours;
	private double fees;
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public CourseItem(String subjectName, int durationInHours, double fees) {
		super();
		this.subjectName = subjectName;
		this.durationInHours = durationInHours;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "\nCourseItem [subjectName=" + subjectName + ", durationInHours=" + durationInHours + ", fees=" + fees
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CourseItem))
			return false;
		CourseItem other = (CourseItem) obj;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}

	@Override
	public int compareTo(CourseItem o) {
	
		return this.durationInHours-o.durationInHours;
	}
	
	
	

}
