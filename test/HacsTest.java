package hacsTesting.hacsTesting;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

@RunWith(JUnitPlatform.class)
@SelectClasses( { AssignmentTest.class, 
	ClassCourseListTest.class,
	CourseSelectDlgTest.class,
	HighLevelCourseMenuTest.class,
	InstructorAssignmentMenuTest.class,
	NodeVisitorTest.class,
	ReminderTest.class,
	CourseTest.class, 
	FacadeTest.class,
	PersonTest.class, 
	ReminderVisitorTest.class,
	StudentTest.class, 
	SolutionIteratorTest.class,
	InstructorTest.class,
	CourseIteratorTest.class, 
	SolutionTest.class,
	ListIteratorTest.class,
	SolutionListTest.class 
	
} )

class HacsTest {

}
