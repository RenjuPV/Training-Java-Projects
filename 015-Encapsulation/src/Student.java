
public class Student {
	
	private int rollNumber;
	private String name;
	private int mark1, mark2;
	private String gender;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber < 0) {
			System.out.println("Invalid Roll number");
			return;
		}
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("Invalid Name");
			return;
		}
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		if (mark1 > 100 || mark1 < 0) {
			System.out.println("Invalid Mark1");
			return;
		}
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		if (mark2 > 100 || mark2 < 0) {
			System.out.println("Invalid Mark2");
			return;
		}
		this.mark2 = mark2;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender != "Female" & gender != "Male") {
			System.out.println("Invalid Gender");
			return;
		}
		this.gender = gender;
	}

}
