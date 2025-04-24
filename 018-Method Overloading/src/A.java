
public class A {

	void test1(int a, float b) {
		System.out.println("test1" + a + "," + b);
	}

	static void test1(int a, float b, double c) {
		System.out.println("static test1" + a + "," + b + "," + c);
	}

	void test1() {
		System.out.println("test1");
	}

	/*
	 * int test1() {//same method name with same parameters and different return type is not allowed
	 * 
	 * }
	 */

	int test1(boolean isAvailable) {
		System.out.println("test1" + isAvailable);
		return 0;
	}

}
