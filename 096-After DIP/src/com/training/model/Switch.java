package com.training.model;

public class Switch {

	Switchable switchable;

	public Switch(Switchable switchable) {
		super();
		this.switchable = switchable;
	}

	public void turnOn() {
		this.switchable.turnOn();
	}

	public void turnOff() {
		this.switchable.turnOff();
	}

}
