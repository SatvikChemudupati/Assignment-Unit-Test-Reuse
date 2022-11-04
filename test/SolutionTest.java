package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class SolutionTest {

	@Test
	void testSolution() {
		System.out.println("Testing in Solution Class");
	}

	@Test
	void testToString() {
		Solution solution = new Solution();
		solution.setTheAuthor("Satvik Chemudupati");
		solution.setSolutionFileName("Assignment Test");
		solution.setTheGrade(9);
		solution.setReported(true);
		String result = solution.toString();
		assertEquals("Satvik Chemudupati  Assignment Test Grade=9  reported", result);
	}

	@Test
	void testGetGradeString() {
	}

	@Test
	void testGetGradeInt() {
		Solution solution = new Solution();
		solution.setTheGrade(8);
		assertEquals(8, solution.getGradeInt());

	}

	@Test
	void testIsReported() {
		Solution solution = new Solution();
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

}

