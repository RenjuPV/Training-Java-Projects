package com.training.ui;

public class Main {

	public static void main(String[] args) {
		MenuHandler handler=new MenuHandler();
		int choice;
		do {
			handler.displayMenu();
			choice=handler.getChoice();
			ChoiceHandler.handleChoice(choice);
		}while(choice<6);
		

	}

}
