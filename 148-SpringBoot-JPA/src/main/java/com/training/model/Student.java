package com.training.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	private int rollNumber;
	@Column
	private String name;
	@Column
	private char gender;
	@Column
	private int mark1;
	@Column
	private int mark2;

	public Student(int rollNumber, String name, char gender, int mark1, int mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getTotal() {
		return this.mark1 + this.mark2;
	}

	public double getAverage() {
		return this.getTotal() / 2.0;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", gender=" + gender + ", mark1=" + mark1
				+ ", mark2=" + mark2 + ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return rollNumber == other.rollNumber;
	}

}
