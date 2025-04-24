package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Student;


@WebServlet(name = "StudentListController", urlPatterns = { "/SLCS" })
public class StudentListControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student1=new Student(1088,"Ram","Male",80,90);
		Student student2=new Student(1089,"Rmesh","Male",70,90);
		Student student3=new Student(1090,"Satheesh","Male",60,90);
		Student student4=new Student(1091,"Seetha","Female",77,90);
		Student student5=new Student(1092,"Keerthi","Female",99,100);
		
		List<Student> students=new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		request.setAttribute("studs", students);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("StudentList.jsp");
		dispatcher.forward(request, response);
		
	}

}
