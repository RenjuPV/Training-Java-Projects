
public class B {

	void display() {
		System.out.println("Nothing to Display");
	}

	void display(int a, int b) {
		System.out.println("Inside display a " + a + " b " + b);

	}
	
	/* int display(int a, int b) {//only return type change is not allowed for method overloading
		System.out.println("Inside display a " + a + " b " + b);

	} */

	void display(int a, float b) {
		System.out.println("Inside display a " + a + " b " + b);

	}

	void display(int a, float b, boolean isPresent) {
		System.out.println("Inside display a " + a + " b " + b + " isPresent " + isPresent);

	}

	int display(int a) {
		System.out.println("Inside int display a " + a);
		return a;
	}
	
	static void display(int a, float b, double c) {
		System.out.println("static display " + a + "," + b + "," + c);
	}
	
	static void display(int a, double b) {
		System.out.println("static display " + a + "," + b);
	}
	
}
