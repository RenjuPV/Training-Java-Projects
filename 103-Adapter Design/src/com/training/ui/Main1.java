package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.dp.CollegeStudent;
import com.training.dp.SchoolStudent;
import com.training.dp.SchoolStudentadapter;
import com.training.dp.Student;
import com.training.dp.UniversityStudent;
import com.training.dp.UniversityStudentAdapter;

public class Main1 {
	public static void main(String[] args) {
		List<Student> students=new LinkedList<>();
		CollegeStudent cs=new CollegeStudent("Suresh", "Iyer", "suresh@gmail.com");
		students.add(cs);
		System.out.println(students);
		
		SchoolStudent ss=new SchoolStudent("Anila", "Nair", "anila@gmail.com");
		SchoolStudentadapter ssa=new SchoolStudentadapter(ss);
		
		students.add(ssa);
		System.out.println(students);
		
		UniversityStudent us=new UniversityStudent("Renju", "PV", "renju@gmail.com");
		UniversityStudentAdapter usa=new UniversityStudentAdapter(us);
		
		students.add(usa);
		System.out.println(students);
		
		
	}

}
