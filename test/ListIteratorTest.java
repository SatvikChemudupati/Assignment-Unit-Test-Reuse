package hacsTesting.hacsTesting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Satvik Chemudupati
 * @version 1.0
 */

class ListIteratorTest {

	@Test
	void testListIterator() {
		System.out.println("Testing in ListIterator Class");
	}

	@Test
	void testHasNext() {
		ArrayList<Object> listObject = new ArrayList<>();
		listObject.add("hello");
		ListIterator listIterator = new ListIterator(listObject);
		assertTrue(listIterator.hasNext());
	}

	@Test
	void testNext() {
		ArrayList<Object> listObject = new ArrayList<>();
		listObject.add("hello");
		ListIterator listIterator = new ListIterator(listObject);
		assertEquals("hello", listIterator.next());
	}

	@Test
	void testRemove() {
		ArrayList<Object> listObject = new ArrayList<>();
		listObject.add("hello");
		ListIterator listIterator = new ListIterator(listObject);
		int size = 0;
		listIterator.next();
		listIterator.remove();
		int resultSize = listObject.size();
		assertEquals(size, resultSize);
	}

}


