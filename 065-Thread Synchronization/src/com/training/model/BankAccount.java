package com.training.model;

public class BankAccount {

	double balance = 5.0;

	public synchronized void deposit(double amt) {

		// this.balance = this.balance + amt;
		String tName = Thread.currentThread().getName();

		for (int i = 1; i <= amt; i++) {
			this.balance++;
			if (this.balance >= 25) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(tName + " : Depositing..." + this.balance);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		System.out.println("Depositing completed with the amount of "+amt);
	}

	public synchronized void withdraw(double amt) {

		// this.balance = this.balance + amt;
		String tName = Thread.currentThread().getName();

		for (int i = 1; i <= amt; i++) {
			this.balance--;
			if (this.balance <= 5) {
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println(tName + " : Withdrawing..." + this.balance);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		System.out.println("Withdrawing  completed with the amount of  "+amt);
	}

}
