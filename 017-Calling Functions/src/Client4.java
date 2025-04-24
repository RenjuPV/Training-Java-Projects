import java.util.Arrays;

public class Client4 {
	
	/*public static void test1(int[] x) {
		System.out.println(Arrays.toString(x));
	} */
	//var-args
	public static void test1(int...x) {
		System.out.println(Arrays.toString(x));
	}
	
	
	
	

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		test1(arr1);
		
		int[] arr2=new int[] {10,20,30,40,50};
		test1(arr2);
		
		int[] arr3= {};
		test1(arr3);
		
		
		test1(80,90,100,20,10,15);
		test1(new int[] {4,5,6,7});
		test1(2,5);
		test1();
		
		
		
		

	}

}
