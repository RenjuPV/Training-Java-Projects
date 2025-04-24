package com.training.service;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Student;

public class StudentServiceImpl implements StudentService{
	
	private List<Student> allStudents;
	
	//Step1
	private StudentServiceImpl() {
		this.allStudents=new LinkedList<>();
	}
	
	//step2
	static StudentServiceImpl instance=null;
	
	//step3
	
	public static StudentService getInstance() {
		if(instance==null)
			instance=new StudentServiceImpl();
		return instance;
	}
	
	
	@Override
	public void addStudent(Student student) {
		this.allStudents.add(student);
		
	}

	@Override
	public Student searchStudent(int rollNumber) {
		Student student=new Student();
		student.setRollNumber(rollNumber);
		
		int r=allStudents.indexOf(student);
		if(r>=0) {
			Student result=allStudents.get(r);
			return result;
		}
		else {
			return null;		
		}
		
	}

	@Override
	public void updateStudent(Student student) {
		int r=allStudents.indexOf(student);
		if(r>=0) {
			allStudents.set(r, student);
		}
		
	}

	@Override
	public List<Student> getAllStudents() {
		return allStudents;
	}

	@Override
	public void deleteStudent(int rollNumber) {
		Student student=new Student();
		student.setRollNumber(rollNumber);
		allStudents.remove(student);
		
	}

	

}
