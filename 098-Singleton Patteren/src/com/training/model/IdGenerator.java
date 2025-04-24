package com.training.model;

public class IdGenerator {

	private  int number = 0;

	public int getNextId() {
		return ++number;
	}

	// step 1
	private IdGenerator() {

	}
    //step 2
	private static IdGenerator instance = null;
	
	public static IdGenerator getInstance() {
		if(instance==null)
			instance=new IdGenerator();//one object is created
		return instance;
	}
}
