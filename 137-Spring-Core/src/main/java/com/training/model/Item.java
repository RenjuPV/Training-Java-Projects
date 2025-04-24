package com.training.model;

import java.util.Arrays;

public class Item {
	
	String itemName;
	double price;
	double[] priceHistory;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double[] getPriceHistory() {
		return priceHistory;
	}

	public void setPriceHistory(double[] priceHistory) {
		this.priceHistory = priceHistory;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", priceHistory=" + Arrays.toString(priceHistory)
				+ "]";
	}

}
