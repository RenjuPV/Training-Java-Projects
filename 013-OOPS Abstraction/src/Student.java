
public class Student {
	String name;
	int mark1, mark2;

	int computeTotal() {
		return mark1 + mark2;
	}

	int getAverage() {
		return computeTotal() / 2;
	}

	char determineGrade() {
		int average = getAverage();
		char grade;
		if (average >= 80)
			grade = 'A';
		else if (average >= 60)
			grade = 'B';
		else if (average >= 40)
			grade = 'C';
		else
			grade = 'D';
		return grade;

	}

}
