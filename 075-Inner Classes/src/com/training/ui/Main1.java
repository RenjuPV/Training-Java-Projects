package com.training.ui;

import com.training.model.A;
import com.training.model.A.B;

public class Main1 {

	public static void main(String[] args) {

		A obj1 = new A();
		obj1.setX(10);
		obj1.printX();

		System.out.println(obj1.getObj());
		System.out.println(obj1);
		obj1 = null;

		// A.B obj2 = obj1.new B();
		// obj2.setY(20);
		// obj2.printY();

		// System.out.println();
	}

}
