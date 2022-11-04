package hacsTesting.hacsTesting;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * 
 * @author Satvik Chemudupati
 * @version 3.0 Formatted code and removed warnings 
 */

abstract public class NodeVisitor {

	public NodeVisitor() {
	}

	abstract public void visitFacade(Facade facade);

	abstract public void visitCourse(Course course);

	abstract public void visitAssignment(Assignment assignment);

}
