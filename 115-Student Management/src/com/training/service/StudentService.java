package com.training.service;

import java.util.List;

import com.training.model.Student;

public interface StudentService {
	
		void addStudent(Student student);
		Student searchStudent(int rollNumber);
		void updateStudent(Student student);
		List<Student> getAllStudents();
		void deleteStudent(int rollNumber);
}
