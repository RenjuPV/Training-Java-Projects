
public class StudentClient {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="Renju";
		s1.mark1=80;
		s1.mark2=90;
		System.out.println("Details of Student1 \n");
		System.out.println("Name "+s1.name);
		System.out.println("Mark1 "+s1.mark1);
		System.out.println("Mark1 "+s1.mark2);
		System.out.println("Total "+s1.computeTotal());
		System.out.println("Average "+s1.getAverage());
		System.out.println("Grade "+s1.determineGrade());
		
		
		Student s2=new Student();
		s2.name="Anju";
		s2.mark1=70;
		s2.mark2=50;
		System.out.println("Details of Student2 \n");
		System.out.println("Name "+s2.name);
		System.out.println("Mark1 "+s2.mark1);
		System.out.println("Mark1 "+s2.mark2);
		System.out.println("Total "+s2.computeTotal());
		System.out.println("Average "+s2.getAverage());
		System.out.println("Grade "+s2.determineGrade());
	}

}
