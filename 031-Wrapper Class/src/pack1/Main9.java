package pack1;

public class Main9 {

	public static void main(String[] args) {
		
		char ch='A';
		Character obj1=Character.valueOf(ch);//boxing
		
		char ch1=obj1.charValue();//unboxing
		
		//Conversion methods not available
		
		char c=obj1;
		
		Character  obj2=ch;
		
		System.out.println(Character.isAlphabetic(66));
		System.out.println(Character.isDigit(50));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isUpperCase('C'));
		

	}

}
