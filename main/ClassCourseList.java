package hacsTesting.hacsTesting;

import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 *
 * @author Satvik Chemudupati
 * @version 3.0 Formatted code and removed warnings
 */

public class ClassCourseList extends ArrayList<Course> {

	@Serial
	private static final long serialVersionUID = 1L;

	public ClassCourseList() {

	}

	// initialize the list by reading from the file.
	void initializeFromFile() {
		try {
			BufferedReader file;
			String strCourseName;
			file = new BufferedReader(new FileReader("CourseInfo.txt"));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
				add(theCourse);
			}
		} catch (Exception ee) {
			System.out.println("Exception" + ee + "occurred for" + "CourseInfo.txt");
		}
	}

	Course findCourseByCourseName(String courseName) {
		for (Course course : this) {
			if ( course.courseName.compareTo(courseName) == 0) {
				return course;
			}
		}
		return null;
	}

}

