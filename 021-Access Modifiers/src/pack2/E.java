package pack2;

import pack1.A;

public class E extends A {

	public void test4() {

		// System.out.println(v1);
		// System.out.println(v2);//not a friendly subclass
		System.out.println(v3);
		System.out.println(v4);
	}

	public void test5() {
		
		A obj=new A();

		//System.out.println(obj.v1);
		//System.out.println(obj.v2);
		//System.out.println(obj.v3);
		System.out.println(obj.v4);
	}

}
