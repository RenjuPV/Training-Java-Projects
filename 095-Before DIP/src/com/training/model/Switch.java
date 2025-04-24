package com.training.model;

public class Switch {

	LightBulb lightBulb;

	public Switch(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}

	public void turnOn() {
		this.lightBulb.turnOn();
	}

	public void turnOff() {
		this.lightBulb.turnOff();
	}

}
