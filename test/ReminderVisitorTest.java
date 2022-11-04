package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class ReminderVisitorTest {

	@Test
	void testReminderVisitor() {
		System.out.println("Testing in ReminderVistor");
	}

	@Test
	void testVisitFacade() {
	}

	@Test
	void testVisitCourse() {
	}

	@Test
	void testVisitAssignment() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		Assignment testAssignment = new Assignment();
		testAssignment.setAssignmentName("Assignment1");
		Date dueDate = new Date();
		testAssignment.setDueDate(dueDate);
		reminderVisitor.visitAssignment(testAssignment);
		assertNotNull(reminderVisitor.getReminderObject().listUpcoming);
	}

	@Test
	void testReminderVisitorReminder() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		assertNotNull(reminderVisitor.getReminderObject());
	}

}
