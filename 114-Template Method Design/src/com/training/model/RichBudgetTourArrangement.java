package com.training.model;

public class RichBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of Rich Budget,booking 5 star hotel");
		double cost = 5000.00;
		return cost * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of Rich Budget,Flights are arranged");
		double cost = 6000.00;
		return cost * personCount;
	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of Rich Budget,Non Veg food arranged");
		double cost = 2000.00;
		return cost * personCount;
	}

}
