import java.util.Arrays;

public class C {

	void display(double p) {
		System.out.println("Display with double " + p);
	}

	void display(boolean p) {
		System.out.println("Display with boolean " + p);
	}

	void display(int p) {
		System.out.println("Display with int " + p);
	}

	/*
	 * void display(int[] p) {
	 * 
	 * System.out.println("Display with int[] " + Arrays.toString(p)); }
	 */

	void display(int... p) {// ellipsise

		System.out.println("Display with int... " + Arrays.toString(p));
	}

	void display(byte p) {
		System.out.println("Display with byte " + p);
	}

	/*
	 * void display(long p) { System.out.println("Display with int "+p); }
	 */

	/*
	 * void display(int p) { System.out.println("Display with int "+p); }
	 */

	/*
	 * void display(short p) { System.out.println("Display with short  "+p); }
	 */

}
