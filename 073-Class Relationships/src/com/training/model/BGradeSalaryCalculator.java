package com.training.model;

public class BGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double computeAllowance(double basic) {
		//return basic * 0.30;
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.multiply(basic, 0.30);
		return res;
	}

	@Override
	public double computeDeduction(double basic) {

		//return basic * 0.10;
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.multiply(basic, 0.10);
		return res;
	}

	@Override
	public double computeNetSalary(double basic) {
		//return basic + this.computeAllowance(basic) - this.computeDeduction(basic);
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.add(basic, this.computeAllowance(basic));
		res=calculator.subtract(res, this.computeDeduction(basic));
		return res;
	}

}
