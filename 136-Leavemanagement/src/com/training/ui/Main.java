package com.training.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.model.Employee;
import com.training.model.LeaveApplication;
import com.training.model.Manager;

public class Main {

	static List<LeaveApplication> allLeaves = new ArrayList<>();
	static List<Employee> empList = new ArrayList<>();
	static List<Manager> managerList = new ArrayList<>();

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Anu");
		Employee employee2 = new Employee(2, "Manu");
		Employee employee3 = new Employee(3, "Sanu");
		Employee employee4 = new Employee(4, "Tinu");
		Employee employee5 = new Employee(5, "sunu");
		empList.add(employee5);
		empList.add(employee4);
		empList.add(employee3);
		empList.add(employee2);
		empList.add(employee1);

		Manager manager1 = new Manager(101, "Kirthana", "IT");
		Manager manager2 = new Manager(102, "Keerthi", "IT");
		Manager manager3 = new Manager(103, "Shivani", "Health Care");
		managerList.add(manager3);
		managerList.add(manager2);
		managerList.add(manager1);

		String continueChoice;

		do {
			System.out.println(LocalDate.now());
			Scanner scanner = new Scanner(System.in);
			System.out.println("Are you Manager or Employee(Manager/Employee)");
			String role = scanner.next();

			System.out.println("Enter your Id");
			int loginId = scanner.nextInt();

			if (role.equalsIgnoreCase("Employee") && empList.stream().anyMatch(emp -> emp.getId() == loginId)) {
				System.out.println("Fill the details for leave application");
				System.out.println("------------------------");
				System.out.println("Enter your manager Id");
				int managerId = scanner.nextInt();

				System.out.println("Enter from Date");
				LocalDate fromDate = LocalDate.parse(scanner.next());

				System.out.println("Enter to date");
				LocalDate toDate = LocalDate.parse(scanner.next());

				System.out.println("Enter reason for leave");
				String reason = scanner.next();

				LeaveApplication leavApplication = new LeaveApplication();
				boolean isAddLeave = allLeaves
						.add(leavApplication.applyLeave(loginId, managerId, fromDate, toDate, reason));
				if (isAddLeave) {
					System.out.println("Leave applied");
				}
			} else if (role.equalsIgnoreCase("Manager")
					&& managerList.stream().anyMatch(emp -> emp.getId() == loginId)) {
				String managerContinueChoice;
				do {

					System.out.println("1:List all leaves to approve");
					System.out.println("2:List all Approved or Rejected leaves");
					System.out.println("3:Approve or reject leaves");
					System.out.println("Enter your choice(1/2/3)");
					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("----------------------------------");
						System.out.println("List of Leaves to approve or rject");
						System.out.println("----------------------------------");
						for (LeaveApplication application : allLeaves) {
							if (application.getManagerId() == loginId
									&& application.getApprovedOrRejected().equalsIgnoreCase("Pending")) {
								System.out.println(application);
							}
						}
						break;

					case 2:
						System.out.println("----------------------------------");
						System.out.println("List of approved and rjected Leaves");
						System.out.println("----------------------------------");
						for (LeaveApplication application : allLeaves) {
							if (application.getManagerId() == loginId
									&& !application.getApprovedOrRejected().equalsIgnoreCase("Pending")) {
								System.out.println(application);
							}
						}

						break;
					case 3:
						System.out.println("----------------------------------");
						System.out.println("Approve or reject leaves");
						System.out.println("----------------------------------");
						for (LeaveApplication application : allLeaves) {
							if (application.getManagerId() == loginId
									&& application.getApprovedOrRejected().equalsIgnoreCase("Pending")) {
								System.out.println(application);
								System.out.println("Enter the decision you want to take(Approved/Rejected)?");
								String status=scanner.next();
								application.setApprovedOrRejected(status);
								
							}
						}

						break;

					default:
						break;
					}
					System.out.println("Do you want to continue managirial operations?(yes/no)");
					managerContinueChoice = scanner.next();
				} while (managerContinueChoice.equalsIgnoreCase("yes"));
			}
			System.out.println("Do you want to continue?(yes/no)");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes"));

		// if role is employee take input for leave application
		// if the role is manager we should display all the leave application submitted
		// to this manager
		// Manager will see the list he will either approve or reject the leave
		// when an employee is already have a history of leave application it should be
		// displayed
		// with the new leave apply

	}

}
