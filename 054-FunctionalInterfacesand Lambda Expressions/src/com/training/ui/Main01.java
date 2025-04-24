package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.DoubleAcceptor;
import com.training.model.IntegerAcceptor;
import com.training.model.StringAcceptor;

public class Main01 {
	
	public static void main(String[] args) {
		
		Acceptor<String>acceptor=new StringAcceptor();
		acceptor.accept("Renju");
		
		Acceptor<Integer>intAcceptor=new IntegerAcceptor();
		intAcceptor.accept(Integer.valueOf(10));
		
		Acceptor<Double>doubleAcceptor=new DoubleAcceptor();
		doubleAcceptor.accept(Double.valueOf(10));
		
	}

}
