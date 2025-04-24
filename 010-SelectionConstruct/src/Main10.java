import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		int currentQuantity;
		System.out.println("Enter the Quantity");
		Scanner scanner = new Scanner(System.in);
		currentQuantity = scanner.nextInt();

		final int a = 10;
		final int b = 20;
		final int c = 30;
		final int d = 40;

		switch (currentQuantity) {
		case a:
			System.out.println("Stock level Very Low");
			break;
		case b:
			System.out.println("Stock level  Low");
			break;
		case c:
			System.out.println("Stock level  Low");
			break;
		case d:
			System.out.println("Stock level  OK");
			break;

		default:
			System.out.println("Invalid stock level");
			break;
		}

	}

}
