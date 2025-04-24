package com.training.model;

public class Employee {
	public double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [basicSalary=" + basicSalary + "]";
	}

	public double computeAllowance() {
		double result = 0;
		int x = 0;

		class Calculator {// Method Local inner class

			public double add(double a, double b) {
				System.out.println(x);
				System.out.println(basicSalary);
				return a + b;
			}

			public double subtract(double a, double b) {
				return a - b;
			}

			public double multiply(double a, double b) {
				return a * b;
			}

			public double divide(double a, double b) {
				return a / b;
			}
		}

		Calculator calculator = new Calculator();
		result = calculator.multiply(basicSalary, 0.35);
		return result;

	}
}
