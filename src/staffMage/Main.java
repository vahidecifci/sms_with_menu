
package staffMage;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static ArrayList<Programmer> programmerList = new ArrayList<>();
	public static ArrayList<Technician> technicianList = new ArrayList<>();
	public static ArrayList<Employee> empList=new ArrayList<>();
	public static Scanner repeat = new Scanner(System.in);
	public static Report report = new Report();

	public static void main(String[] args) {

		int intYes = 0;
		int intRepeatAdd = 0;

		do {
			String input = JOptionPane.showInputDialog(
					"Please choose a number from 1 to 5\n 1: Add employee \n 2: Update employee \n 3: Remove employee \n 4: Report \n  5: Exit");
			int choice = Integer.parseInt(input);

			switch (choice) {

			case 1: {
				do {

					byte result = UI.showaddMenu();
					if (result == 1) {
						do {

							programmerList.add(ManegmentData.addProgrammer());
							System.out.println("Do you want add more programmer? press 1 for add or 0 to no :\n");
							Scanner in = new Scanner(System.in);
							intYes = in.nextInt();

						} while (intYes == 1);

					} // End of if result == 1

					else if (result == 2) {

						do {
							ManegmentData mng = new ManegmentData();
							technicianList.add(mng.addTechnician());
							System.out.println("Do you want add more technician? press 1 for add or 0 to no :\n");
							Scanner in = new Scanner(System.in);
							intYes = in.nextInt();

						} while (intYes == 1);

					} // End of if result == 2

					System.out
							.println("Do you want to add more programmer or technician? press 1 for add or 0 to no:\n");

					intRepeatAdd = repeat.nextInt();
					repeat.nextLine();

				} while (intRepeatAdd == 1);
				break;

			} // End of Case 1

			case 2: {
				do {

					byte result = UI.showUpdateMenu();
					if (result == 1) {
						do {
							System.out.println(" What is the name of the programmer you want to update?  ");

							String name = repeat.nextLine();

							for (Programmer p : programmerList) {
								if (p.getFullName().equals(name)) {

									ManegmentData.updateProgrammer(p);
								}

							}
							System.out.println("Do you want update more programmer? press 1 for add or 0 to no :\n");
							Scanner in = new Scanner(System.in);
							intYes = in.nextInt();
						} while (intYes == 1);

					} else if (result == 2) {
						do {
							System.out.println(" What is the name of the technician you want to update?  ");

							String name = repeat.nextLine();

							for (Technician t : technicianList) {
								if (t.getFullName().equals(name)) {

									ManegmentData.updateTechnician(t);
								}

							}
							System.out.println("Do you want update more technician? press 1 for add or 0 to no :\n");
							Scanner in = new Scanner(System.in);
							intYes = in.nextInt();
						} while (intYes == 1);

						System.out.println(
								"Do you want to update more programmer or technician? press 1 for update or 0 to no:\n");

						intRepeatAdd = repeat.nextInt();
						repeat.nextLine();
					}

				} while (intRepeatAdd == 1);
				break;
			}
			case 3: {
				do {
					byte result = UI.showDeleteMenu();
					if (result == 1) {
						
							do {
								if (programmerList.size() > 0) {
								System.out.println("Please Enter the name of programmer that you want to delete:\n");
								Scanner in = new Scanner(System.in);
								String name = in.nextLine();

								for (Programmer pro : programmerList) {
									if (pro.getFullName().equals(name)) {
										programmerList.remove(programmerList.indexOf(pro));
										break;

									}

								}
								System.out.println(
										"Do you want to delete more programmer? press 1 for delete or 0 to no :\n");
								intYes = in.nextInt();
							}
						 else {
							System.out.println("No programmers to delete");
						}} while (intYes == 1);
					}
					else if (result == 2) {
						do {
							System.out.println("Please Enter the name of programmer that you want to delete:\n");
							Scanner in = new Scanner(System.in);
							String name = in.nextLine();
							for (Technician tech : technicianList) {
								if (tech.getFullName().equals(name)) {
									technicianList.remove(technicianList.indexOf(tech));
								}
							}
							System.out.println(
									"Do you want to delete more technician? press 1 for delete or 0 to no :\n");
							intYes = in.nextInt();
						} while (intYes == 1);

					}
					System.out.println(
							"Do you want to delete more programmer or technician? press 1 for delete or 0 to no:\n");

					intRepeatAdd = repeat.nextInt();
					repeat.nextLine();

				} while (intRepeatAdd == 1);
				break;

			}
			case 4: {
				report.displayProg(programmerList);
				report.displayTech(technicianList);
				System.out.println("Avarage salary or programmer :"+(double)(report.totalAvarageSalaryProgrammer(programmerList)));
				System.out.println("Avarage salary or Technician :"+(double)(report.totalAvarageSalaryTechnician(technicianList)));
				
				break;

			}
			case 5: {
				System.exit(0);

			}
				break;
			}

		} while (true);
	}
}
