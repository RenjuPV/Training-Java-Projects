package com.training.model;

public class Person implements Comparable<Person> {

	int age;
	int height;
	int weight;

	public Person(int age, int height, int weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Person() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nPerson [age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {

		return this.age - o.age;
	}

}
