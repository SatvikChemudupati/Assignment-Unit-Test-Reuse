package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

@SuppressWarnings("ALL")
class PersonTest {

	@Test
	void testPerson() {
		System.out.println("Testing in Person Class");
	}

	@Test
	void testGetCourseList() {
		Person person = new Student();
		Course selectedCourse = new Course("SER515", 0);
		ClassCourseList theCourseList = new ClassCourseList();
		theCourseList.add(selectedCourse);
		person.addCourse(selectedCourse);
		ClassCourseList classCourseList = person.getCourseList();
		assertEquals(1, classCourseList.size());
	}

	@Test
	void testAddCourse() {
		Person person = new Student();
		Course selectedCourse = new Course("SER515", 0);
		ClassCourseList theCourseList = new ClassCourseList();
		theCourseList.add(selectedCourse);
		person.addCourse(selectedCourse);
		assertEquals(1, theCourseList.size());
	}

}


