package com.training.dp;

public class GiftPack implements Product{
	
	Product product;

	public GiftPack(Product product) {
		super();
		this.product = product;
	}

	@Override
	public double getPrice() {
		if (product == null)
			return 500.00;
		else
			return 500.00 + this.product.getPrice();
	}

	@Override
	public double getDiscount() {
		if (product == null)
			return 50.00;
		else
			return 50.00 + this.product.getDiscount();
	}
	

}
