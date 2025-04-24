package com.training.ui;

import com.training.model.AGradeAllowance;
import com.training.model.AllowanceComputation;
import com.training.model.BGradeAllowance;
import com.training.model.CGradeAllowance;

public class Main1 {

	public static void main(String[] args) {

		AllowanceComputation computation = new AllowanceComputation();

		double aGradeAllowance = computation.computeAllowance(new AGradeAllowance(), 100);
		double bGradeAllowance = computation.computeAllowance(new BGradeAllowance(), 100);
		double cGradeAllowance = computation.computeAllowance(new CGradeAllowance(), 100);

		System.out.println("A Grade Allowance :" + aGradeAllowance);
		System.out.println("B Grade Allowance :" + bGradeAllowance);
		System.out.println("C Grade Allowance :" + cGradeAllowance);

	}

}
