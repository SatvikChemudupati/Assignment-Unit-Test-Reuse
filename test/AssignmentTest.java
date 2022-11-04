package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class AssignmentTest {

	Assignment assignment = new Assignment();

	@Test
	public void testAssignment() {
		System.out.println("Testing in Assignment Class");
	}

	@Test
	public void testToString() {
		String expectedName = null;
		String assignmentName = assignment.toString();
		assertEquals(expectedName, assignmentName);

	}

	@Test
	public void testsetDueDate() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		assertEquals(dateFormat.format(dueDate), assignment.getDueDateString());
	}

	@Test
	public void testisOverDue() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		assertFalse(assignment.isOverDue());
	}

	@Test
	public void testaddSolution() {
		assertNotNull(assignment.addSolution());
	}

	@Test
	public void testgetSugSolution() {
		assertNotNull(assignment.getSugSolution());
	}

	@Test
	public void testGetSolutionIterator() {
		SolutionIterator solutionIterator = assignment.getSolutionIterator();
		assertEquals(0, solutionIterator.solutionlist.size());
	}

}

