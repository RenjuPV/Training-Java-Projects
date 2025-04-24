package com.training.model;

public class MediumBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of medium budget..booking 3 star hotel");
		double costPerPerson = 2000.00;
		return costPerPerson * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of medium budget..arranging taxi");
		double costPerPerson = 1000.00;
		return costPerPerson * personCount;
	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of medium budget..arranging homely food");
		double costPerPerson = 1000.00;
		return costPerPerson * personCount;
	}

}
