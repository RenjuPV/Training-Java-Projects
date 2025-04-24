package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.CarLoan;
import com.training.model.CollegeEducatinLoan;
import com.training.model.EducationalLoan;
import com.training.model.HomeLoan;
import com.training.model.Loan;

public class Main01 {

	static void print1(List<Loan> loans) {
		System.out.println(loans);
	}

	static void print2(List<? extends CarLoan> loans) {
		System.out.println(loans);
	}

	static void print3(List<? extends EducationalLoan> loans) {
		System.out.println(loans);
	}

	static void print4(List<? super EducationalLoan> loans) {
		System.out.println(loans);
	}

	static void print5(List<?> loans) {
		System.out.println(loans);
	}

	static void print6(List<? extends HomeLoan> loans) {
		System.out.println(loans);
	}

	public static void main(String[] args) {

		List<Loan> loans = new LinkedList<>();
		print1(loans);
		// print2(loans);
		// print3(loans);
		print4(loans);// accept educationsloan list and list super of educationalLoan
		print5(loans);
		//print6(loans);

		List<CarLoan> cloans = new LinkedList<>();
		// print1(cloans);
		print2(cloans);
		// print3(cloans);
		// print4(cloans);//will not work
		print5(cloans);
		//print6(cloans);

		List<EducationalLoan> eloans = new LinkedList<>();
		// print1(eloans);
		// print2(eloans);
		print3(eloans);
		print4(eloans);
		print5(eloans);
		// print6(eloans);

		List<CollegeEducatinLoan> celoans = new LinkedList<>();
		// print1(celoans);
		// print2(celoans);
		print3(celoans);
		// print4(celoans);//will not work
		print5(celoans);
		// print6(celoans);

		List<Integer> intList = new LinkedList<>();
		// print1(intList);
		// print2(intList);
		// print3(intList);
		// print4(intList);
		print5(intList);
		// print6(intList);

		List<HomeLoan> hloans = new LinkedList<>();

		// print1(hloans);//accept only list of loans
		// print2(hloans);//accept carLoan list only
		// print3(hloans);//accept only educationloan list
		// print4(hloans);//accept educational loan and all super class of
		// educationalLoan class
		print5(hloans);// accepts all type of lists.
		print6(hloans);

	}
}
