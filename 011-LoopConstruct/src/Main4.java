import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		// to display a menu
		// 1.add employee
		// 2.search employee
		// 3.Display all employee
		// 4.Delete an employee
		// 5.Exit
		// take input for menu choicefrom user
		// printthe menu choice
		// repeat until menuchoice ==5
		int menuChoice;

		do {

			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee");
			System.out.println("3.Display all Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			Scanner scanner = new Scanner(System.in);
			menuChoice = scanner.nextInt();
			System.out.println(menuChoice);

		} while (menuChoice != 5 | menuChoice >=6);

	}

}
