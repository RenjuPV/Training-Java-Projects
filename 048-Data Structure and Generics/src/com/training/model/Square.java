package com.training.model;

import java.util.Objects;

public class Square implements Comparable {
	int size;
	
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Square(int size) {
		super();
		this.size = size;
	}

	public Square() {
		super();
	}
	
	public double getArea() {
		return this.size*this.size;
	}

	

	@Override
	public String toString() {
		return "\nSquare [size=" + size + ", getArea()=" + getArea() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return size == other.size;
	}

	@Override
	public int compareTo(Object o) {
		Square other = (Square) o;
		//return Integer.compare(this.size, other.size);
		if (this.size < other.size)
			return -1;
		if (this.size > other.size)
			return 1;
		return 0; 
	}

}
