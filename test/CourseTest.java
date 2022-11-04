package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class CourseTest {

	String courseName = "Introduction to Software Engineering";
	int courseLevel = 0;
	Course course = new Course(courseName, courseLevel);
	Assignment assignment = new Assignment();

	@Test
	void testCourse() {
		System.out.println("Testing in Course Class");
		assertEquals(courseName, course.toString());
	}

	@Test
	void testAddAssignment() {
		course.addAssignment(assignment);
		assertEquals(1, course.assignmentList.size());
	}

	@Test
	void testToString() {
		assertTrue(course.toString().contentEquals(courseName));
	}

}


