package com.training.model;

import java.util.LinkedList;
import java.util.List;



public class NewsStation implements Subject {
	
	private List<Observer> observers = new LinkedList<>();
	private String news;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		System.out.println("Observer Added");
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
		System.out.println("Observer Removed");
		
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notified:");
		for (Observer observer : observers) {
			observer.update(news);
		}
		
	}
	
	public void setNews(String news) {
		System.out.println("News created");
		this.news = news;
		notifyObservers();
	}

}
