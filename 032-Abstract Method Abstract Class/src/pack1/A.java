package pack1;

public abstract class A {
	
	public void test1() {
		System.out.println("A test1");//may or may not override
	}
	
	public final void test2() {
		System.out.println("A test2");//restrict overriding
	}
	
	 public abstract void test3() ;//abstract method must be override in derived class //must be overriding

}
