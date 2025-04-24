package com.training.model;

public class Main1 {

	public static void main(String[] args) {

		IdGenerator generator = IdGenerator.getInstance();
		
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());
		System.out.println(generator);

		System.out.println("------------------");
		
		IdGenerator generator1 = IdGenerator.getInstance();
		System.out.println(generator1.getNextId());
		System.out.println(generator1.getNextId());
		System.out.println(generator1.getNextId());
		System.out.println(generator1);
		
		System.out.println("---------------");

		IdGenerator generator2 = IdGenerator.getInstance();
		System.out.println(generator2.getNextId());
		System.out.println(generator2.getNextId());
		System.out.println(generator2.getNextId());
		System.out.println(generator2);

	}

}
