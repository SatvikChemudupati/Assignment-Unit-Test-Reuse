package hacsTesting.hacsTesting;

import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 *
 *          update to Java 8
 *
 * @author Satvik Chemudupati
 * @version 3.0 Formatted code and removed warnings
 */

/*
 * this class will iterate the course list attatched to on student and in turn
 * iterate the assignments of a course. after Function Visit(CourseList) it will
 * point to the location before the fist class, hasNext will retrun weather
 * there is next item. the next() will return the next Item Assignment;
 */

public class ReminderVisitor extends NodeVisitor {

	Reminder reminderObject;

	public Reminder getReminderObject() {
		return reminderObject;
	}

	public ReminderVisitor(Reminder reminder) {
		reminderObject = reminder;
	}

	public void visitFacade(Facade facade) {
		CourseIterator courseList = new CourseIterator(facade.theCourseList);
		while (courseList.hasNext()) {
			Course course = (Course) courseList.next();
			course.accept(this);
		}
	}

	public void visitCourse(Course course) {
		for (Assignment assignment : course.assignmentList) {
			assignment.accept(this);
		}
	}

	public void visitAssignment(Assignment assignment) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int ntoday = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(assignment.dueDate);
		int nDueDate = calendar.get(Calendar.DAY_OF_YEAR);
		if (nDueDate <= (ntoday + 1) && nDueDate >= ntoday) /// upcoming
		{
			reminderObject.listUpcoming.add("today is " + today + " " + assignment.assignmentName
					+ " Due Date is " + assignment.getDueDateString());
		}
		if (nDueDate < ntoday) {
			reminderObject.listOverdue.add(assignment.assignmentName + " Due Date is " + assignment.getDueDateString());
		}

	}

}
