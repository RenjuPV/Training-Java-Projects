import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		int quantity;
		
		System.out.println("Enter the quantity");
		Scanner scanner = new Scanner(System.in);
		quantity = scanner.nextInt();

		// selection Construct

		if (quantity >= 90)
			System.out.println("*****");
		else if (quantity >= 70)

			System.out.println("****");

		else if (quantity >= 50)

			System.out.println("***");
		else
			System.out.println("**");

	}

}
