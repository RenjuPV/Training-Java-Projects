
public class Circle {

	private int radius;

	Circle() {
		System.out.println("Object is created");

	}

	Circle(int radius) {
		this.radius = radius;
		System.out.println("Object is created with radius " + radius);

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius < 0) {
			System.out.println("Invalid radius");
			return;
		}
		radius = radius;
	}

	double getArea() {
		return 3.14 * radius * radius;
	}

}
