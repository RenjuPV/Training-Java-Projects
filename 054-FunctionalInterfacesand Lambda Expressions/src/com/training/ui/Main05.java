package com.training.ui;

import com.training.model.Acceptor;

public class Main05 {

	public static void main(String[] args) {

		Acceptor<String> acceptor1;
		acceptor1 = s -> {
			System.out.println(s.length());
			System.out.println(s.toUpperCase());
		};
		acceptor1.accept("Welcome");

		Acceptor<Integer> acceptor2;
		acceptor2 = obj -> {
			System.out.println(obj.intValue());
			System.out.println(obj.doubleValue());
		};
		acceptor2.accept(400);

		Acceptor<Double> acceptor3;
		acceptor3 = d -> System.out.println(d.intValue());

		acceptor3.accept(40.00);

		Acceptor<StringBuffer> acceptor4;
		acceptor4 = s -> {
			System.out.println("String before reverse :"+s);
			System.out.println("String after reverse :"+s.reverse());
		};
		acceptor4.accept(new StringBuffer("RENJU"));

	}

}
