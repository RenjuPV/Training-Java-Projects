package com.training.model;

import java.util.Arrays;

public class Car {
	
	private Engine engine;
	private BreakSystem breakSystem;
	private Wheel[] wheels;

	public Car() {
		this.wheels = new Wheel[] {new Wheel(),new Wheel(),new Wheel(),new Wheel()};
		this.engine=new Engine();
		this.breakSystem=new BreakSystem();

	}

	private class Wheel {

		@Override
		public String toString() {
			return "Wheel []";
		}

	}
	
	private class Engine{

		@Override
		public String toString() {
			return "Engine []";
		}
		
	}
	
	private class BreakSystem{

		@Override
		public String toString() {
			return "BreakSystem []";
		}
		
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", breakSystem=" + breakSystem + ", wheels=" + Arrays.toString(wheels) + "]";
	}
	
	
}
