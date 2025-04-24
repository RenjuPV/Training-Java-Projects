package com.training.ui;

import com.training.dp.Circle;
import com.training.dp.ShapeFactory;

public class Main1 {

	private static final String colors[] = { "Red", "Green", "Blue","Black","White" };

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();

		}


	}

}
