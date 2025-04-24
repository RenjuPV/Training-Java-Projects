package pack1;

public class B extends A {
	
	/*@Override
	public A() {
		System.out.println("An object is created");
	} */
	
	@Override
	public void f1(int a) {
		System.out.println("f1 in B "+a);
	}
	
	
	private void f2(int a) {
		System.out.println("f2 in B "+a);
	}
	
	//@Override
	public static void f3(float a) {
		System.out.println("f3 in B "+a);
	}
	
	/*public  void f4(double d) {//we can not override final methods
		System.out.println("f4 in B "+d);
	}*/

	

}
