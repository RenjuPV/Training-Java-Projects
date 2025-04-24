package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitors")
public class Visitor {

	@Id
	@Column(name = "visitor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "visitor_name")
	String name;
	
	@Column(name = "visitor_gender")
	String gender;
	
	@Column(name = "visitor_comingfrom")
	String comingfrom;

	public Visitor(int id, String name, String gender, String comingfrom) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.comingfrom = comingfrom;
	}

	public Visitor() {
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

	public String getComingfrom() {
		return comingfrom;
	}

	public void setComingfrom(String comingfrom) {
		this.comingfrom = comingfrom;
	}

	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", gender=" + gender + ", comingfrom=" + comingfrom + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Visitor))
			return false;
		Visitor other = (Visitor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	

}
