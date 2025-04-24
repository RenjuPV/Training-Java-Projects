package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Employee;

public class EmployeeBasicSalaryDescendingComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {

		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;

		if (emp1.getBasic() < emp2.getBasic())
			return 1;
		if (emp1.getBasic() > emp2.getBasic())
			return -1;

		return 0;

	}

}
