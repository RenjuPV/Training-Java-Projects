package pack2;

import pack1.Accountant;
import pack1.Circle;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesEmployee;
import pack1.Square;
import pack1.Student;

public class Main3 {

	public static void print1(Circle c) {
		System.out.println(c.getRadius());

	}

	public static void print2(Employee e) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getBasic());

		if (e instanceof Manager) {
			Manager m = (Manager) e;// reference casting,Down casting,Explicit
			System.out.println(m.getEmpCount());
		} else if (e instanceof SalesEmployee) {
			SalesEmployee se = (SalesEmployee) e;
			System.out.println(se.getAreaName());
		} else if (e instanceof Accountant) {
			Accountant temp = (Accountant) e;
			System.out.println(temp.isAuditor());
		}

	}

	public static void print3(Object o) {
		if (o instanceof Circle) {
			Circle temp = (Circle) o;
			System.out.println(temp.getRadius());
		}
		if (o instanceof Employee) {
			Employee temp = (Employee) o;
			System.out.println(temp.getId());
			System.out.println(temp.getName());
			System.out.println(temp.getBasic());
		}

		if (o instanceof Manager) {
			Manager temp = (Manager) o;// reference casting,Down casting,Explicit
			System.out.println(temp.getEmpCount());
		}
		if (o instanceof SalesEmployee) {
			SalesEmployee temp = (SalesEmployee) o;
			System.out.println(temp.getAreaName());
		}
		if (o instanceof Accountant) {
			Accountant temp = (Accountant) o;
			System.out.println(temp.isAuditor());
		}

		if (o instanceof Student) {
			Student temp = (Student) o;
			System.out.println(temp.getRollNumber());
			System.out.println(temp.getName());
			System.out.println(temp.getMark1());
			System.out.println(temp.getMark2());
			System.out.println(temp.getTotal());

		}
		
		if (o instanceof Square) {
			Square temp = (Square) o;
			System.out.println("size "+temp.getSize());
			System.out.println("area "+temp.getArea());
			

		}

	}

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.radius = 80;
		print1(c1);

		Employee e = new Employee(101, "Ram", 300.00);
		print2(e);

		Manager m = new Manager(101, "Seetha", 300.00, 10);
		print2(m);

		SalesEmployee se = new SalesEmployee();
		se.setId(101);
		se.setName("RAMU");
		se.setBasic(5500);
		se.setEmpCount(50);
		se.setAreaName("COC");
		print2(se);

		Accountant a = new Accountant();
		a.setBasic(0);
		a.setId(0);
		a.setName(null);
		a.setAuditor(false);
		print2(a);

		print3(c1);
		print3(e);
		print3(m);
		print3(se);
		print3(a);
		
		Student st = new Student(101, "Renju", 89, 90);
		print3(st);
		
		Square sq=new Square(10);
		print3(sq);
		
		Square sq1=new Square();
		sq1.setSize(20);
		print3(sq1);

	}

}
