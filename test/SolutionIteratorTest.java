package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class SolutionIteratorTest {

	SolutionList theSolutionList = new SolutionList();
	Solution theSolution = new Solution();

	@Test
	void testSolutionIterator() {
		System.out.println("Testing in Solution Iterator");
	}

	@Test
	void testSolutionIteratorSolutionList() {
	}

	@Test
	void testMoveToHead() {
		theSolutionList.add(theSolution);
		SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
		solutionIterator.moveToHead();
		assertEquals(-1, solutionIterator.getCurrentSolutionNumber());
	}

	@Test
	void testHasNext() {
		theSolutionList.add(theSolution);
		SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	void testNext() {
		theSolutionList.add(theSolution);
		SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
		assertNotNull(solutionIterator.next());
	}

	@Test
	void testNextString() {
		theSolution.setTheAuthor("Author1");
		theSolutionList.add(theSolution);
		SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
		assertNotNull(solutionIterator.next("Author1"));
	}

	@Test
	void testRemove() {
		theSolutionList.add(theSolution);
		SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
		int size = solutionIterator.solutionlist.size() - 1;
		solutionIterator.next();
		solutionIterator.remove();
		int resultSize = solutionIterator.solutionlist.size();
		assertEquals(size, resultSize);

	}

}

