package pack2;

import pack1.Employee;
import pack1.Student;

public class Main8 {
	
	public static void main(String[] args) {

		Student s1=new Student(101, "Renju", 80, 90);
		Student s2=new Student(102, "Anju", 70, 90);
		Student s3=new Student(101, "Manju", 80, 90);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		
	}

}
