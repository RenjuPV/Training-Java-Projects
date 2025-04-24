import java.util.Arrays;

public class main10 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };// in line initialization
		int[] array2 = new int[3];
		int[] array3 = new int[] { 4, 5, 6, 7 };
		byte b1 = 10;
		short s1 = 20;
		int i1 = 100;
		char ch1 = 'A';
		long l1 = 800;
		double d1 = 80.0;
		int[] array4 = { b1, s1, i1, ch1, 100, 200, 300 };
		String str = "";
		/*
		 * for (int e : array4) { str = str + e + ","; }
		 */
		for (int i = 0; i < array4.length; i++) {
			if (i == array4.length - 1)
				str = str + array4[i];
			else
				str = str + array4[i] + ",";

		}
		str = str + "]";
		System.out.println(str);
		System.out.println(Arrays.toString(array4));
	}
}
