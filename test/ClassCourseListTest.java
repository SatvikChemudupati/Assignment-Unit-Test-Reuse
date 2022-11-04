package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class ClassCourseListTest {

	ClassCourseList classCourseList = new ClassCourseList();

	@Test
	public void testClassCourseList() {
		System.out.println("Testing in ClassCourseList Class");
	}

	@Test
	public void testinitializeFromFile() {
		classCourseList.initializeFromFile();
		Course result = classCourseList.get(0);
		assertEquals("CSE870", result.toString());
		assertEquals(3, classCourseList.size());
	}

	@Test
	public void testfindCourseByCourseName() {
		classCourseList.initializeFromFile();
		assertEquals("CSE870", classCourseList.findCourseByCourseName("CSE870").toString());
		assertNotEquals("CSE870", classCourseList.findCourseByCourseName("CSE890").toString());
	}

}

