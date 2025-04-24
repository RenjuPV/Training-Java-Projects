package com.training.ui;

import com.training.model.LowBudgetTourArrangement;
import com.training.model.MediumBudgetTourArrangement;
import com.training.model.RichBudgetTourArrangement;
import com.training.model.TourArrangement;

public class Main1 {

	public static void main(String[] args) {

		TourArrangement arrangement = new LowBudgetTourArrangement();
		double totalCost = arrangement.arrangeTour(10);
		System.out.println(totalCost);

		arrangement = new RichBudgetTourArrangement();
		totalCost = arrangement.arrangeTour(10);
		System.out.println(totalCost);

		arrangement = new MediumBudgetTourArrangement();
		totalCost = arrangement.arrangeTour(10);
		System.out.println(totalCost);

	}

}
