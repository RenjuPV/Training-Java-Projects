package com.training.dp;

public class Box implements Product {
	Product product;

	public Box(Product product) {
		super();
		this.product = product;
	}

	@Override
	public double getPrice() {
		if (product == null)
			return 200.00;
		else
			return 200.00 + this.product.getPrice();

	}

	@Override
	public double getDiscount() {
		if (product == null)
			return 20.00;
		else
			return 20.00 + this.product.getDiscount();
	}

}
