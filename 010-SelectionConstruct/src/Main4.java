
public class Main4 {

	public static void main(String[] args) {
		
		int marks;
		marks = 66;
		char grade;

		// selection Construct
		if (marks >= 90) {
			grade = 'A';

			System.out.println("Your are Eligible for Scholership");
		} else if (marks >= 70) {
			grade = 'B';
			
			System.out.println("You have to wait to become Eligible for Scolership");
		} else {
			System.out.println("Failed");
		}

	}

}
