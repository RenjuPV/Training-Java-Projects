
public class StudentClient {

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.setName("Renju");
		s1.setRollNumber(1);
		s1.setMark1(90);
		s1.setMark2(100);
		s1.setGender("Female");
		
		System.out.println("Name : "+s1.getName());
		System.out.println("Roll Number : "+s1.getRollNumber());
		System.out.println("Mark1 : "+s1.getMark1());
		System.out.println("Mark2 : "+s1.getMark2());
		System.out.println("Gender : "+s1.getGender());
		
		System.out.println("\n**************\n");
		Student s2=new Student(2, "Maya", 85, 78, "Female");
		System.out.println("Name : "+s2.getName());
		System.out.println("Roll Number : "+s2.getRollNumber());
		System.out.println("Mark1 : "+s2.getMark1());
		System.out.println("Mark2 : "+s2.getMark2());
		System.out.println("Gender : "+s2.getGender());
		

	}

}
