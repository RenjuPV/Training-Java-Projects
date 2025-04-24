package com.training.model;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String gender;
	private String cityName;
	private double basic;

	public Employee(int id, String name, String gender, String cityName, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.cityName = cityName;
		this.basic = basic;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double netSalary() {
		return this.basic + (this.basic * 0.40) - (this.basic * 0.25);
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", cityName=" + cityName + ", basic="
				+ basic + ", netSalary()=" + netSalary() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

	

	@Override
	public int compareTo(Employee o) {
		if (this.id < o.id)
			return -1;
		if (this.id > o.id)
			return 1;

		return 0;
	}

}
