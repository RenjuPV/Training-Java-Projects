package pack1;

public class Main2 {
	
	public static void main(String[] args) {
		
		String s=new String("Welcome to UST-Global, Cochin Center");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(s.length()-1));
		
		for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(i));
		System.out.println();
		
		System.out.println(s.contains("TVM"));
		System.out.println(s.startsWith("Wel"));
		System.out.println(s.endsWith("Wel"));
		
		System.out.println(s.indexOf("UST"));
		System.out.println(s.indexOf('c'));
		System.out.println(s.lastIndexOf('c'));
		System.out.println(s.indexOf('c',25));
		System.out.println(s.lastIndexOf('c',10));
		
		String s1=s.substring(10);
		System.out.println(s1);
		
		String s2=s.replace('C', 'c');
		System.out.println(s2);
		
		String s3=s.substring(10,15);
		System.out.println(s3);
		
		String s4=s.toUpperCase();
		System.out.println(s4);
		
		String s5=s.toLowerCase();
		System.out.println(s5);
		
		String s6=s.toLowerCase();
		System.out.println(s5);
		
		
		String s7=String.format("%d,%-20s,%.2f",10,"hi",20.0f);
		System.out.println(s7);
		
	}

}
