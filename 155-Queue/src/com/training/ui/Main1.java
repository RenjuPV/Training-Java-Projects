package com.training.ui;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();

		queue.add(20);
		queue.add(15);
		queue.add(17);
		queue.add(12);
		queue.add(16);

		Integer temp = queue.peek();
		System.out.println(temp);

	}
}
