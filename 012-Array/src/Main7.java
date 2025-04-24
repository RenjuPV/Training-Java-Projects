
public class Main7 {

	public static void main(String[] args) {

		//Task 1
		int[] array = { 14, 20, 30, 10 };
		int sum = 0;
		for (int i :array) {
			sum +=i;
		}
		
		float avg = sum / array.length;
	
		System.out.println("sum " + sum);
		System.out.println("Average:" + avg);

	}

}
