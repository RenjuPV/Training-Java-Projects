package com.training.ui;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Student;
import com.training.service.StudentService;

@Controller
public class StudentManagementController {
	
	@Autowired
	StudentService service;

	@RequestMapping("/ListStudents")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView("DisplayAllStudents");
		List<Student> allStudents = service.getAllStudents();
		mav.addObject("studs", allStudents);
		return mav;

	}

	@RequestMapping("/AddStudent1")
	public String f2(Model model) {
		model.addAttribute("stud", new Student());
		return "NewStudentInput";

	}

	@RequestMapping(value = "/AddStudent2", method = RequestMethod.POST)
	public String f3(@ModelAttribute Student student, Map<String, Object> map) {
		Student  student1 = service.addStudent(student);
		return "StudentAddResult";
	}
	
	@RequestMapping("/UpdateStudent1")
	public String f4(Model model) {
		List<Student>allStudents=service.getAllStudents();
		model.addAttribute("studs",allStudents);
		return "ListStudentsForUpdate";
		
	}
	
	@RequestMapping("/UpdateStudent2")
	public String f5(@RequestParam(name="txt_rollNumber") int rollNumber,Map<String,Object>modelMap) {
		Student studentForEdit=service.searchStudent(rollNumber);
		modelMap.put("stud", studentForEdit);
		return "EditStudent";
	}
	
	@RequestMapping(value = "/UpdateStudent3", method = RequestMethod.POST)
	public String f6(@ModelAttribute(name="stud") Student student, Map<String, Object> modelMap) {
		Student student1=service.updateStudent(student);
		return "StudentUpdateResult";
	}
	
	@RequestMapping("/DeleteStudent1")
	public String f7(Model model) {
		List<Student>allStudents=service.getAllStudents();
		model.addAttribute("studs",allStudents);
		return "ListStudentsForDelete";
		
	}
	@RequestMapping("/DeleteStudent2")
	public String f8(@RequestParam(name="txt_rollNumber") int rollNumber,Map<String,Object>modelMap) {
		Student studentForDelete=service.searchStudent(rollNumber);
		modelMap.put("stud", studentForDelete);
		return "DeleteStudent";
	}
	
	@RequestMapping(value = "/DeleteStudent3", method = RequestMethod.POST)
	public String f9(@ModelAttribute(name="stud") Student student, Map<String, Object> modelMap) {
		boolean status=service.deleteStudent(student);
		if(status==true) {
			modelMap.put("message", "Student deleted successfully");
		} else {
			modelMap.put("message", "Student not deleted");
		}
		return "StudentDeleteResult";
	}

}
