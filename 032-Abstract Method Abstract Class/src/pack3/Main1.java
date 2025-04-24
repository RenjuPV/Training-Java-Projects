package pack3;

import pack1.A;
import pack1.B;
import pack1.D;
import pack1.E;
import pack1.c;

public class Main1 {
	
	public static void main(String[] args) {
		
		A obj;
		//obj=new A();//we can not create object for an abstract class
		
		obj=new B();
		obj.test1();
		obj.test2();
		obj.test3();
		
		System.out.println("-----------------");
		obj=new c();
		obj.test1();
		obj.test2();
		obj.test3();
		
		//obj=new D();//can not create object for abstract class 
		
		
		System.out.println("-----------------");
		D obj1;
		obj1=new E();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		
		
	}

}
