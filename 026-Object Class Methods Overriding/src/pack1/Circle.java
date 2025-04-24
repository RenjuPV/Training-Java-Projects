package pack1;

import java.util.Objects;

public class Circle {

	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius =" + this.radius + " getArea()=" + this.getArea() + "]";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	

	

	
	
	

}
