package com.training.ui;

import com.training.model.LightBulb;
import com.training.model.Switch;

public class Main1 {
	
	public static void main(String[] args) {
		LightBulb bulb=new LightBulb();
		Switch switch1=new Switch(bulb);
		switch1.turnOff();
		switch1.turnOn();
		
	}

}
