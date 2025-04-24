package pack1;

public class A {
	private int v1;//private access
	int v2;//default access level
	protected int v3;
	public int v4;
	
	public void test1() {
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}

}
