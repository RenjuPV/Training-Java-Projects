package com.training.model;

public class AGradeSalarayCalculator implements SalaryCalculator {

	@Override
	public double computeAllowance(double basic) {
		
		//return basic*0.35;
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.multiply(basic, 0.35);
		return res;
	}

	@Override
	public double computeDeduction(double basic) {
		//return basic*0.21;
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.multiply(basic, 0.21);
		return res;
	}

	@Override
	public double computeNetSalary(double basic) {
		
		//return basic+this.computeAllowance(basic)-this.computeDeduction(basic);
		
		SimpleCalculator calculator=new SimpleCalculator();
		double res=calculator.add(basic, this.computeAllowance(basic));
		res=calculator.subtract(res, this.computeDeduction(basic));
		return res;
		
	}

}
