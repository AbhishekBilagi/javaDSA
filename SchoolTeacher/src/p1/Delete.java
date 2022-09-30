package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Delete {
	Scanner sc = new Scanner(System.in);
	List<Teacher> teacherList = new ArrayList<>();
	List<Class> classesList = new ArrayList<>();
	List<Subject> subjectsList = new ArrayList<>();
	public void doExecuteMenuDriven() {
 		int choice;
 		loop:do {
 			printDeleteMenu();
 			choice = sc.nextInt();
 			switch(choice) {
 			case 1:
 				deleteTeacher();
 				break;
 				
 			case 2:
 				deleteClasses();
 				break;
 				
 			case 3:
 				deleteSubjects();
 				break;
 				
 			case 4:
 				break loop;
 			}
 			
 		}while(choice != 0);
 	}
	public void printDeleteMenu() {
 		System.out.println("1.Delete Teacher\n2.Delete Class\n3.Delete Subject\n4.Back to main menu");
 		System.out.println("Select Option");
 	}
	
	public void deleteTeacher() {
		teacherNamesFromFile();  
		int flag = 0;
		sc.nextLine();
		System.out.println("Enter the teacher name");
		String name = sc.nextLine();
		for(Teacher obj : teacherList) {
			if(obj.getName().equals(name)) {
				teacherList.remove(obj);
				writeBackInFileForTeacher(); 
				System.out.println("Teacher deleted Successfully");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("No Teacher found of this name");
		}
	}
	
	public void deleteClasses() {
		classesNamesFromFile();  //put all the names from file to a list
		int flag = 0;
		sc.nextLine();
		System.out.println("Enter the class name");
		String name = sc.nextLine();
		for(Class obj : classesList) {
			if(obj.getClassName().equals(name)) {
				classesList.remove(obj);
				writeBackInFileForClasses();    // after removing , put the remaining file names to the list
				System.out.println("Classes deleted Successfully");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("No Classes found of this name");
		}
	}
	
	public void deleteSubjects() {
		subjectsNamesFromFile();  //put all the names from file to a list
		int flag = 0;
		sc.nextLine();
		System.out.println("Enter the subject name");
		String name = sc.nextLine();
		for(Subject obj : subjectsList) {
			if(obj.getSubjectName().equals(name)) {
				subjectsList.remove(obj);
				writeBackInFileForSubjects();    // after removing , put the remaining file names to the list
				System.out.println("subject deleted Successfully");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("No subject found of this name");
		}
	}
	
	
	public void writeBackInFileForTeacher() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\\\Users\\\\Miles\\\\Desktop\\\\project\\\\teacher.txt"));
			for(Teacher ob : teacherList) {
				String names = ob.getName();
				writer.write(names + "\n");
			}
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeBackInFileForClasses() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\\\Users\\\\Miles\\\\Desktop\\\\project\\\\class.txt"));
			for(Class ob : classesList) {
				String names = ob.getClassName();
				writer.write(names + "\n");
			}
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeBackInFileForSubjects() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\\\Users\\\\Miles\\\\Desktop\\\\project\\\\subject.txt"));
			for(Subject ob : subjectsList) {
				String names = ob.getSubjectName();
				writer.write(names + "\n");
			}
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void teacherNamesFromFile() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"c:\\\\\\\\Users\\\\\\\\Miles\\\\\\\\Desktop\\\\\\\\project\\\\\\\\teacher.txt"));
			String line = reader.readLine();
			while (line != null) {
				Teacher teacher = new Teacher(line);
				teacherList.add(teacher);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void classesNamesFromFile() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"c:\\\\\\\\Users\\\\\\\\Miles\\\\\\\\Desktop\\\\\\\\project\\\\\\\\class.txt"));
			String line = reader.readLine();
			while (line != null) {
				Class classes = new Class(line);
				classesList.add(classes);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void subjectsNamesFromFile() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"c:\\\\\\\\Users\\\\\\\\Miles\\\\\\\\Desktop\\\\\\\\project\\\\\\\\subject.txt"));
			String line = reader.readLine();
			while (line != null) {
				Subject sub = new Subject(line);
				subjectsList.add(sub);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}