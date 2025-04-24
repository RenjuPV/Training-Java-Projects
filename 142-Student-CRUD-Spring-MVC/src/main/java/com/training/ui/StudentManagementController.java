package com.training.ui;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

@Controller
public class StudentManagementController {

	@RequestMapping("/ListStudents")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView("DisplayAllStudents");
		StudentService service = new StudentServiceImpl();
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
		StudentService service = new StudentServiceImpl();
		boolean status = service.addStudent(student);
		if (status == true) {
			map.put("message", "Student added successfully");
		} else {
			map.put("message", "Student not added");
		}
		return "StudentAddResult";
	}
	
	@RequestMapping("/UpdateStudent1")
	public String f4(Model model) {
		StudentService service=new StudentServiceImpl();
		List<Student>allStudents=service.getAllStudents();
		model.addAttribute("studs",allStudents);
		return "ListStudentsForUpdate";
		
	}
	
	@RequestMapping("/UpdateStudent2")
	public String f5(@RequestParam(name="txt_rollNumber") int rollNumber,Map<String,Object>modelMap) {
		StudentService service=new StudentServiceImpl();
		Student studentForEdit=service.searchStudent(rollNumber);
		modelMap.put("stud", studentForEdit);
		return "EditStudent";
	}
	
	@RequestMapping(value = "/UpdateStudent3", method = RequestMethod.POST)
	public String f6(@ModelAttribute(name="stud") Student student, Map<String, Object> modelMap) {
		StudentService service=new StudentServiceImpl();
		boolean status=service.updateStudent(student);
		if(status==true) {
			modelMap.put("message", "Student updated successfully");
		} else {
			modelMap.put("message", "Student not updated");
		}
		return "StudentUpdateResult";
	}
	
	@RequestMapping("/DeleteStudent1")
	public String f7(Model model) {
		StudentService service=new StudentServiceImpl();
		List<Student>allStudents=service.getAllStudents();
		model.addAttribute("studs",allStudents);
		return "ListStudentsForDelete";
		
	}
	@RequestMapping("/DeleteStudent2")
	public String f8(@RequestParam(name="txt_rollNumber") int rollNumber,Map<String,Object>modelMap) {
		StudentService service=new StudentServiceImpl();
		Student studentForDelete=service.searchStudent(rollNumber);
		modelMap.put("stud", studentForDelete);
		return "DeleteStudent";
	}
	
	@RequestMapping(value = "/DeleteStudent3", method = RequestMethod.POST)
	public String f9(@ModelAttribute(name="stud") Student student, Map<String, Object> modelMap) {
		StudentService service=new StudentServiceImpl();
		boolean status=service.deleteStudent(student.getRollNumber());
		if(status==true) {
			modelMap.put("message", "Student deleted successfully");
		} else {
			modelMap.put("message", "Student not deleted");
		}
		return "StudentDeleteResult";
	}

}
