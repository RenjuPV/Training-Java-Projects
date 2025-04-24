package com.training.actions;

public class ExitAction extends Action{
	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Exiting Applicatiom");
		System.out.println("\t\t------------------------");
		
	}

	@Override
	public void execute() {
		System.out.println("\t\tThank you");
		
	}

	@Override
	public void complete() {
		System.exit(0);
		
	}

}
