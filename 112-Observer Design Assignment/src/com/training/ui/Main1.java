package com.training.ui;

import com.training.model.NewsPaper;
import com.training.model.NewsStation;
import com.training.model.Observer;
import com.training.model.TVChannel;
import com.training.model.Youtube;

public class Main1 {
	public static void main(String[] args) {
		
		Observer observer1 = new NewsPaper();
		Observer observer2 = new TVChannel();
		Observer observer3 = new Youtube();

		NewsStation subject = new NewsStation();
		
		subject.setNews("Sports News");
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);

		subject.setNews("Sports News");
		System.out.println("---------------------");
		subject.setNews("Film News");
		System.out.println("---------------------");
		

		subject.removeObserver(observer2);
		subject.setNews("Election news");
	}

}
