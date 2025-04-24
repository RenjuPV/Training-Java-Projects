import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		
		int[] marks;
		int size;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=scanner.nextInt();
		
		marks=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<marks.length;i++) {
			marks[i]=scanner.nextInt();
		}
		
		for(int num:marks) {
			System.out.println(num);
		}
	}

}
