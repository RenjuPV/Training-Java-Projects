package com.training.ui;

import java.io.Console;

import com.training.ui.util.ConsoleIO;

public class MenuHandler {
		public void displayMenu() {
			String[] options= {
					"Add new Student",
					"Search student",
					"Update student",
					"List All Students",
					"Delete Student",
					"Exit"
			};
			System.out.println("\t\t\t\t Menu");
			for(int i=0;i<options.length;i++)
			{
				System.out.println("\t\t "+(i+1)+"."+options[i]);
			}
		}
		public int getChoice(){
			ConsoleIO.prompt("enter your choice");
			int choice=ConsoleIO.intInput();
			return choice;
		}
}
