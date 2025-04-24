package com.traing.model;

import java.io.IOException;
import java.sql.SQLException;

public class D extends C {

	@Override
	public void test7() { // overriding method can have zero exception listed in superclass

	}

	@Override
	public void test6() throws ArithmeticException, NullPointerException {// overriding method can have more exceptions than listed in supper class
																			

	}

	@Override
	public void test1() throws IOException {

	}// overriding method can have less number of exceptions listed in super class

	@Override
	public void test2() throws IOException { // Overriding method should not throw any checked exception that is not in
												// super class

	}

	@Override
	public void test3() throws ArithmeticException, NullPointerException {// overriding method can throw any number of
																			// unchecked exceptions which are not in
																			// super class

	}

	@Override
	public void test4() throws Exception {// overriding method should not throw narrow exception class

	}

	@Override
	public void test5() throws SQLException {// overriding method can throw wider exceptions

	}

}
