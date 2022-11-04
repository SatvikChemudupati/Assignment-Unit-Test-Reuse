package hacsTesting.hacsTesting;

import java.util.Iterator;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 *
 * @author Satvik Chemudupati
 * @version 3.0 Formatted code and removed warnings
 */

@SuppressWarnings("rawtypes")
public class SolutionIterator implements Iterator {
	SolutionList solutionlist;

	int currentSolutionNumber = -1;

	public int getCurrentSolutionNumber() {
		return currentSolutionNumber;
	}

	public SolutionIterator(SolutionList thesolutionlist) {
		solutionlist = thesolutionlist;
		moveToHead();
	}

	public void moveToHead() {
		currentSolutionNumber = -1;
	}

	public boolean hasNext() {
		return currentSolutionNumber < solutionlist.size() - 1;
	}

	public Object next() {
		if (hasNext()) {
			currentSolutionNumber++;
			return solutionlist.get(currentSolutionNumber);
		} else {
			return null;
		}
	}

	public Object next(String UserName) {
		Solution theSolution;
		theSolution = (Solution) next();
		while (theSolution != null) {
			if (UserName.compareTo(theSolution.theAuthor) == 0) {
				return theSolution;
			}
			theSolution = (Solution) next();
		}
		return null;
	}

	public void remove() {
		solutionlist.remove(currentSolutionNumber);
	}

}
