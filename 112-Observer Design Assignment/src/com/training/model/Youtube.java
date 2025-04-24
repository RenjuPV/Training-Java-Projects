package com.training.model;

public class Youtube implements Observer {

	@Override
	public void update(String news) {
		System.out.println("Youtube :" + news);

	}

}
