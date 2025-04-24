import java.util.Scanner;

public class Main6 {
	
	public static void main(String[] args) {
		long[] profits;
		int arraySize;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		arraySize=scanner.nextInt();
		
		profits=new long[arraySize];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<profits.length;i++) {
			profits[i]=scanner.nextLong();
		}
		
		System.out.println("Array elements:");
		for(long num:profits) {
			System.out.println(num);
		}
		profits=null;
		
	}

}
