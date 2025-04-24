
public class StudentClient {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Renju");
		student.setRollNumber(-293);
		student.setMark1(101);
		student.setMark2(85);
		student.setGender("Female");
		
		System.out.println(student.getName());
		System.out.println(student.getRollNumber());
		System.out.println(student.getMark1());
		System.out.println(student.getMark2());
		System.out.println(student.getGender());
		

	}

}
