
public class Main8 {
	public static void main(String[] args) {

		// task2
		int[] array = { 14, 20, 30, 10 };
		int min = array[0];
		int max = array[0];
		for (int i:array) {
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		System.out.println("Minimum " + min);
		System.out.println("Maximum " + max);
	}

}
