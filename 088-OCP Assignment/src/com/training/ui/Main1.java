package com.training.ui;

import com.training.model.AGradeDeduction;
import com.training.model.BGradeDeduction;
import com.training.model.CGradeDeduction;
import com.training.model.DedectionCalculator;

public class Main1 {

	public static void main(String[] args) {

		DedectionCalculator calculator = new DedectionCalculator();

		double aGradeDeduction = calculator.computeDeduction(new AGradeDeduction(), 1000);
		double bGradeDeduction = calculator.computeDeduction(new BGradeDeduction(), 1000);
		double cGradeDeduction = calculator.computeDeduction(new CGradeDeduction(), 1000);

		System.out.println("A Grade Deduction :" + aGradeDeduction);
		System.out.println("B Grade Deduction :" + bGradeDeduction);
		System.out.println("C Grade Deduction :" + cGradeDeduction);

	}

}
