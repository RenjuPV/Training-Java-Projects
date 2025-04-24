package com.training.ui;

import com.training.ds.Queue;
import com.training.ds.SimpleQueueImpl;
import com.training.model.Circle;

public class Main4 {

	public static void main(String[] args) {

		Queue<Circle> circleQueue = null;

		try {
			circleQueue = new SimpleQueueImpl<>(10);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			
			
			circleQueue.enqueue(new Circle(1));
			circleQueue.enqueue(new Circle(2));
			circleQueue.enqueue(new Circle(3));
			circleQueue.enqueue(new Circle(4));
			circleQueue.enqueue(new Circle(5));
			circleQueue.enqueue(new Circle(6));
			circleQueue.enqueue(new Circle(7));
			circleQueue.enqueue(new Circle(8));
			circleQueue.enqueue(new Circle(9));
			circleQueue.enqueue(new Circle(10));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println(circleQueue);
		
		Circle c = circleQueue.getFront();
		System.out.println(c);

		try {
			circleQueue.dequeue();
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(circleQueue);
		c = circleQueue.getFront();
		System.out.println(c);
		try {
			circleQueue.dequeue();
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(circleQueue);
		c = circleQueue.getFront();
		System.out.println(c);
		try {
			circleQueue.dequeue();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
