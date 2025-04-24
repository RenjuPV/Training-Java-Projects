package com.training.ui;

import com.training.model.A;
import com.training.model.C;
import com.training.model.D;
import com.training.model.E;
import com.training.model.X;

public class Main1 {

	public static void main(String[] args) {
		
		A obj=new D();
		obj.f1();
		obj.f2();
		
		System.out.println("---------------");
		obj=new C();
		obj.f1();
		obj.f2();
		obj.f3();
		
		System.out.println("---------------");
		obj=new E();
		obj.f1();
		obj.f2();
		
		System.out.println("---------------");
		A.f5();
		
		System.out.println("---------------");
		
		X.test2();
		X obj2=new C();
		obj2.test1();
		obj2.test3();
		

	}

}
