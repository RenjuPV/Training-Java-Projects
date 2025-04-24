package com.training.model;

public class TVChannel implements Observer {

	@Override
	public void update(String news) {
		System.out.println("TV Channel :" + news);

	}

}
