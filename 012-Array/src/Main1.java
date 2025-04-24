
public class Main1 {
	public static void main(String[] args) {

		int age = 50;

		int[] years;// array declaration
		years = new int[3];// array creation

		System.out.println(years.length);

		for (int i = 0; i < years.length; i++)
			System.out.println(years[i]);

		years[0] = 1991;
		years[1] = 2000;
		years[2] = 2010;

		for (int i = 0; i < years.length; i++)
			System.out.println(years[i]);

		years = null;

	}

}
