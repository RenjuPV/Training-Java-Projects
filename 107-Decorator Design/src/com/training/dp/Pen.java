package com.training.dp;

public class Pen implements Product{
	Product product;

	public Pen(Product product) {
		super();
		this.product = product;
	}
	
	

	public Pen() {
		super();
	}



	@Override
	public double getPrice() {
		if (product == null)
			return 100;
		else
			return 100 + this.product.getPrice();
	}

	@Override
	public double getDiscount() {
		if (product == null)
			return 10;
		else
			return 10 + this.product.getDiscount();
	}

}
