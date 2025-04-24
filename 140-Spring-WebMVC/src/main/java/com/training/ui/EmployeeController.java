package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Employee;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@RequestMapping("/emp")
	public ModelAndView f1() {

		ModelAndView mav = new ModelAndView("empOutput");
		Employee employee = new Employee(1001, "Kiran", "Male", "Mumbai", 4000);

		mav.addObject("empl", employee);
		return mav;

	}

	@RequestMapping("/input")
	public ModelAndView f2() {

		ModelAndView mav = new ModelAndView("empInput");
		Employee employee = new Employee();
		mav.addObject("emp", employee);
		return mav;

	}

	@RequestMapping("/output")
	public String f3(@ModelAttribute(value = "emp") @Valid Employee employee, BindingResult result,
			Map<String, Object> modelMap) {
		System.out.println(result.getAllErrors());
		if (result.hasErrors()) {
			return "empInput";
		} else {
			modelMap.put("empl", employee);
			return "empOutput";
		}

	}

	@RequestMapping("/allemployees")
	public ModelAndView f4() {

		ModelAndView mav = new ModelAndView("empList");
		Employee employee1 = new Employee(101, "Anila", "Female", "Ekm", 1000);
		Employee employee2 = new Employee(102, "Sanila", "Female", "Ekm", 1000);
		Employee employee3 = new Employee(103, "Sujith", "Male", "Ekm", 1000);
		Employee employee4 = new Employee(104, "Sushama", "Female", "Ekm", 1000);
		Employee employee5 = new Employee(105, "Anamika", "Female", "Ekm", 1000);

		List<Employee> employees = new LinkedList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		mav.addObject("emps", employees);
		return mav;

	}

}
