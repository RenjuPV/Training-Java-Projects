package pack1;

public class A {
	int x, y, z;

	public A() {
		System.out.println("A object created without argument");
	}

	public A(int x) {
		this();
		System.out.println("A object created with 1 argument");
		this.x = x;

	}

	public A(int x, int y) {
		this(x);
		System.out.println("A object created with 2 argument");
		// this.x = x;
		this.y = y;

	}

	public A(int x, int y, int z) {
		this(x, y);// constructor chaining.it should be the first statement
		System.out.println("A object created with 3 argument");
		// this.x = x;
		// this.y = y;
		this.z = z;

	}

	public void display() {
		System.out.println(this.x + "," + this.y + "," + this.z);
	}

}
