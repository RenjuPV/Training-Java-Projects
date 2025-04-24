package com.training.model;

public class LowBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of low budget..booking simple hotel");
		double costPerPerson = 500.00;
		return costPerPerson * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of low budget..arranging simple transport");
		double ticketCost = 300.00;
		return ticketCost * personCount;

	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of low budget..arranging veg food");
		double cost = 100.00;
		return cost * personCount;
	}

}
