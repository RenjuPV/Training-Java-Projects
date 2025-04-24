package com.training.model;

import java.util.Objects;

public class BillItem implements Comparable {

	private String itemName;
	private int quantity;
	private double price;

	public BillItem(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public BillItem() {
		super();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		BillItem other = (BillItem) o;
		return this.itemName.compareTo(other.itemName);
	}

	@Override
	public String toString() {
		return "\nBillItem [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BillItem other = (BillItem) obj;
		return Objects.equals(itemName, other.itemName);
	}

}
