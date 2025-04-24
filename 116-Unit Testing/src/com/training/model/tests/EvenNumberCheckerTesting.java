package com.training.model.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.model.EvenNumberChecker;

public class EvenNumberCheckerTesting {

	@ParameterizedTest(name = "Testing Even Number Computation")
	@ValueSource(ints = { 2, 4, 6, 8 })
	public void testEvenNumber(int number) {
		assertTrue(EvenNumberChecker.compute(number));

	}

}
