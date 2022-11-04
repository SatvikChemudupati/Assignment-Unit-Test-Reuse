package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class FacadeTest {

	Facade facade = new Facade();

	@Test
	void testFacade() {
		System.out.println("Testing in Facade");
	}

	@Test
	void testCreateUser() {
		UserInfoItem userInfo = new UserInfoItem();
		userInfo.userType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(userInfo);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	void testCreateCourseList() {
		String expectedCourse = "CSE870";
		facade.createCourseList();
		assertEquals(expectedCourse, facade.theCourseList.get(0).toString());
	}

	@Test
	void testAttachCourseToUser() {
		UserInfoItem userInfo = new UserInfoItem();
		userInfo.userType = UserInfoItem.USER_TYPE.Student;
		userInfo.strUserName = "pepe";
		facade.createUser(userInfo);
		facade.createCourseList();
		facade.attachCourseToUser();
		String expectedCourse = "CSE870";
		assertEquals(expectedCourse, facade.thePerson.getCourseList().get(0).toString());
	}

}

