package com.training.ui;

import java.io.Console;

import com.training.ui.util.ConsoleIO;

public class MenuHandler {
		public void displayMenu() {
			String[] options= {
					"Add new Customer",
					"Search Customer",
					"Update Customer",
					"List All Customers",
					"Delete Customer",
					"Exit"
			};
			System.out.println("\t\t\t\t Menu");
			for(int i=0;i<options.length;i++)
			{
				System.out.println("\t\t "+(i+1)+"."+options[i]);
			}
		}
		public int getChoice(){
			ConsoleIO.prompt("Enter your choice");
			int choice=ConsoleIO.intInput();
			return choice;
		}
}
