import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {

		int mark1, mark2;
		float average;
		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter mark1");
		mark1 = scanner.nextInt();

		System.out.println("Enter mark2");
		mark2 = scanner.nextInt();

		average = (mark1 + mark2) / 2.0f;
		System.out.println(average);

		// selection Construct

		if (average >= 80) {
			grade = 'A';
			System.out.println("Grade : A");
		} else if (average >= 60) {
			grade = 'B';
			System.out.println("Grade : B");
		} else if (average >= 40) {
			grade = 'C';
			System.out.println("Grade : C");
		} else {
			grade = 'D';
			System.out.println("Grade : D");
		}

		if (grade == 'A')
			System.out.println("ScholarShip is 50000");
		else if (grade == 'B')

			System.out.println("ScholarShip is 40000");
		else if (grade == 'C')

			System.out.println("ScholarShip is 30000");
		else

			System.out.println("ScholarShip is 0.0");

	}

}
