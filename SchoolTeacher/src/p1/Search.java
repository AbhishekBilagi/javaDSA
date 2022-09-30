package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Search {
	Scanner sc = new Scanner(System.in);

	public void doExecuteMenuDriven() {
		int choice;
		loop: do {
			printSearchMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				searchTeacher();
				break;

			case 2:
				searchSubject();
				break;

			case 3:
				searchSubject();
				break;

			case 4:
				break loop;
			}

		} while (choice != 0);
	}

	public void printSearchMenu() {
		System.out.println("1.Search Teacher\n2.Search Class\n3.Search Subject\n4.Back to main menu");
		System.out.println("Select Option");
	}

	public void searchTeacher() {
		BufferedReader reader;
		int flag = 0;
		try {
			sc.nextLine();
			System.out.println("Enter the name of Teacher:");
			String name = sc.nextLine();
			reader = new BufferedReader(
					new FileReader("c:\\\\\\\\Users\\\\\\\\Miles\\\\\\\\Desktop\\\\\\\\project\\\\\\\\teacher.txt"));
			String line = reader.readLine();
			while (line != null) {
				if (line.equals(name)) {
					System.out.println("Teacher found name:->" + name);
					flag = 1;
					reader.close();
					break;
				} else {
					line = reader.readLine();
					reader.close();
				}
			}
			if (flag == 0) {
				System.out.println("Teacher Not Found in the File");
			}

		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
		}
	}

	public void searchSubject() {
		BufferedReader reader;
		int flag = 0;
		try {
			sc.nextLine();
			System.out.println("Enter the name of subject:");
			String name = sc.nextLine();
			reader = new BufferedReader(
					new FileReader("c:\\\\\\\\Users\\\\\\\\Miles\\\\\\\\Desktop\\\\\\\\project\\\\\\\\subject.txt"));
			String line = reader.readLine();
			while (line != null) {
				if (line.equals(name)) {
					System.out.println("subject name found:->" + name);
					flag = 1;
					reader.close();
					break;
				} else {
					line = reader.readLine();
					reader.close();
				}
			}
			if (flag == 0) {
				System.out.println("subject Not Found in the File");
			}

		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
