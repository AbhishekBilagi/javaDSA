package p1;

import java.io.File;
import java.util.*;

public class Display {

	public void getAllFiles() {
		List<String> list = new ArrayList<>();

		try {
			File dir = new File("c:\\Users\\Miles\\Desktop\\project");
			File[] filesList = dir.listFiles();
			for (File file : filesList) {
				if (file.isFile()) {
					list.add(file.getName());
				}
			}
			list.stream().sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).forEach(s -> System.out.println(s));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}