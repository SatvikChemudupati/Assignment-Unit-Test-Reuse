package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class StudentTest {

	@Test
	void testStudent() {
		System.out.println("Testing in Student Class");
	}

	@Test
	void testCreateCourseMenu() {
		Student student = new Student();
		Course selectedCourse = new Course("Introduction to Software Engineering", 0);
		CourseMenu courseMenu;
		courseMenu = student.createCourseMenu(selectedCourse, 0);
		assertNotNull(courseMenu);
	}

}
