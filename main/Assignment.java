package hacsTesting.hacsTesting;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 *
 * @author Satvik Chemudupati
 * @version 2.0
 */

import java.util.*;
import java.text.DateFormat;

public class Assignment {

	protected String assignmentName;
	protected Date dueDate = new Date();
	protected String assignmentSpecification;
	protected SolutionList theSolutionList = new SolutionList();
	protected Solution suggestSolution = new Solution();

	public Assignment() {
	}

	public void setDueDate(Date theDueDate) {
		this.dueDate = theDueDate;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public boolean isOverDue() {
		Date today;
		today = new Date();
		return today.after(this.dueDate);
	}

	public Solution addSolution() {
		return new Solution();
	}

	// add the theSolution to the Solution list
	public void addSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
	}

	public void submitSolution() {
		getSolutionList();
		System.out.println("Inside Submitting Solution");
	}

	public void getSolutionList() {
		System.out.println("To get solution");
		submitSolution();
	}

	/*
	 * return the solution of the give name
	 */
	public Solution getSolution(String studentname) {
		SolutionIterator iterator = (SolutionIterator) theSolutionList.iterator();
		return (Solution) iterator.next(studentname);
	}

	public Solution getSugSolution() {
		return suggestSolution;
	}

	public SolutionIterator getSolutionIterator() {
		return new SolutionIterator(theSolutionList);
	}

	public String toString() {
		return assignmentName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(dueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
	}
}

