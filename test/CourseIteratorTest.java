package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class CourseIteratorTest {

	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	void testCourseIterator() {
		System.out.println("Testing in CourseIterator Class");
	}

	@Test
	void testhasNext() {
		classCourseList.initializeFromFile();
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertTrue(courseIterator.hasNext());
		courseIterator.next();
		courseIterator.next();
		courseIterator.next();
		assertFalse(courseIterator.hasNext());
	}

	@Test
	void testnext() {
		classCourseList.initializeFromFile();
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		Course expectedCourse = classCourseList.get(0);
		Course actualCourse = (Course) courseIterator.next();
		assertEquals(expectedCourse, actualCourse);
	}

	@Test
	void testRemove() {
		classCourseList.initializeFromFile();
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		int size = classCourseList.size() - 1;
		courseIterator.next();
		courseIterator.remove();
		int resultSize = classCourseList.size();
		assertEquals(size, resultSize);
	}

	@Test
	void testObjectNext() {
		classCourseList.initializeFromFile();
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		Course expectedCourse = classCourseList.get(1);
		Course resultednextCourse = (Course) courseIterator.next("CSE880");
		assertEquals(expectedCourse, resultednextCourse);
	}

}

