package com.training.ui;

import java.util.PriorityQueue;

public class Main3 {

	public static void main(String[] args) {
		PriorityQueue<String> names;
		names = new PriorityQueue<>();

		names.add("Nimmi");
		names.add("Anju");
		names.add("Renju");
		names.add("Sanju");
		names.add("Manju");
		

		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());

	}
}
