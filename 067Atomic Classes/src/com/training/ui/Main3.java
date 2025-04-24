package com.training.ui;

import com.training.model.SafeLongIncrement;

public class Main3 {

	
public static void main(String[] args) {
		
		SafeLongIncrement sLi=new SafeLongIncrement();
		sLi.increment();
		System.out.println(sLi.getValue());
		
	}
}
