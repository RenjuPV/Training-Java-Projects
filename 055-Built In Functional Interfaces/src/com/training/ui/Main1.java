package com.training.ui;

import java.util.function.Consumer;

public class Main1 {

	public static void main(String[] args) {

		Consumer<String> consumer1;
		consumer1 = s -> System.out.println(s.length());
		consumer1.accept("welcome");
		
		
		Consumer<Integer> consumer2;
		consumer2 = d -> System.out.println(d.doubleValue());
		consumer2.accept(Integer.valueOf(80));

	}

}
