package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class InstructorTest {

	Instructor instructor = new Instructor();

	@Test
	void testCreateCourseMenu() {
		System.out.println("Testing for creation High Level Course Menu");
		CourseMenu courseMenuLow = instructor.createCourseMenu(new Course("Test Course", 0), 0);
		assertTrue(courseMenuLow instanceof HighLevelCourseMenu);

		System.out.println("Testing for creation Low Level Course Menu");
		CourseMenu courseMenuHigh = instructor.createCourseMenu(new Course("Test Course", 1), 1);
		assertTrue(courseMenuHigh instanceof LowLevelCourseMenu);
	}

	@Test
	void testInstructor() {
		System.out.println("Testing in Instructor class");
	}


}
