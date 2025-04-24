package com.training.ui;

import java.util.Random;
import static java.lang.Math.*;

public class Main2 {

	public static void main(String[] args) {
		double result1 = min(24.0, 44.0);
		System.out.println(result1);

		double result2 = max(24.0, 44.0);
		System.out.println(result2);

		System.out.println(cbrt(16.00));
		System.out.println((int) random() * 10);

		Random random = new Random();
		System.out.println(random.nextInt());

	}

}
