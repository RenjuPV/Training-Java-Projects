package pack1;

public class Main1 {

	public static void main(String[] args) {
		
		String s=new String("Welcome");
		System.out.println(s);
		System.out.println(s.length());
		
		char[] arr= {'a','b','c','d'};
		String s1=new String(arr);
		System.out.println(s1);
		System.out.println(s1.length());
		
		byte[] arr1= {6,7,8,9};
		String s2=new String(arr1);
		System.out.println(s2);
		System.out.println(s2.length());
		
		String s3=new String();
		System.out.println(s3);
		System.out.println(s3.length());

	}

}
