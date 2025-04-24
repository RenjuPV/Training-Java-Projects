package com.training.ui;

import com.training.model.RollNumberGenerator;

public class Main1 {

	public static void main(String[] args) {

		RollNumberGenerator generator = RollNumberGenerator.getInstance();
		System.out.println(generator.getNextRollNumber());
		System.out.println(generator.getNextRollNumber());
		System.out.println(generator.getNextRollNumber());
		//System.out.println(generator);

		System.out.println("------------------");

		RollNumberGenerator generator1 = RollNumberGenerator.getInstance();
		System.out.println(generator1.getNextRollNumber());
		System.out.println(generator1.getNextRollNumber());
		System.out.println(generator1.getNextRollNumber());
		//System.out.println(generator1);

		System.out.println("---------------");

		RollNumberGenerator generator2 = RollNumberGenerator.getInstance();
		System.out.println(generator2.getNextRollNumber());
		System.out.println(generator2.getNextRollNumber());
		System.out.println(generator2.getNextRollNumber());
		//System.out.println(generator2);

	}

}
