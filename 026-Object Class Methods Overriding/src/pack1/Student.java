package pack1;

public class Student {

	
	private int rollNumber;
	private String name;
	private int mark1,mark2;
	
	
	public Student(int rollNumber, String name, int mark1, int mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMark1() {
		return mark1;
	}


	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}


	public int getMark2() {
		return mark2;
	}


	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	public int computeTotal() {
		return this.mark1+this.mark2;
	}
	
	

	public double getAverage() {
		return this.computeTotal()/2;
	}
	
	public char getGrade() {
		
		double average=getAverage();
		char grade;
		if(average >=80)
			grade='A';
		else if(average>=60)
			grade='B';
		else if(average>=40)
			grade='C';
		else
			grade='D';
		return grade;
	}
	
	@Override
	public String toString() {
		return "Student [getRollNumber()=" + getRollNumber() + ", getName()=" + getName() + ", getMark1()=" + getMark1()
				+ ", getMark2()=" + getMark2() + ", computeTotal()=" + computeTotal() + ", getAverage()=" + getAverage()
				+ ", getGrade()=" + getGrade() +  "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}


	
	

	
}
