package com.training.ui;

import com.training.model.LightBulb;
import com.training.model.Radio;
import com.training.model.Switch;
import com.training.model.Switchable;
import com.training.model.TV;

public class Main1 {
	
	public static void main(String[] args) {
		
		Switchable switchable=new LightBulb();
		Switch switch1=new Switch(switchable);
		switch1.turnOn();
		switch1.turnOff();
		
		
		switchable=new Radio();
		Switch switch2=new Switch(switchable);
		switch2.turnOn();
		switch2.turnOff();
		
		switchable=new TV();
		Switch switch3=new Switch(switchable);
		switch3.turnOn();
		switch3.turnOff();
		
		
	}

}
