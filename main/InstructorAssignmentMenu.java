package hacsTesting.hacsTesting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serial;
import java.text.DateFormat;

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
public class InstructorAssignmentMenu extends AssignmentMenu {

	@Serial
	private static final long serialVersionUID = 1L;
	private Assignment theAssignment;
	JComboBox solutionListCombox = new JComboBox();

	JTextField tbAssignmentName = new JTextField();
	JTextField tbDueDate = new JTextField();
	JTextField tbSuggestedSolution = new JTextField();

	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JButton buttonGrade = new JButton();
	JButton buttonReport = new JButton();
	JButton buttonClose = new JButton();

	public InstructorAssignmentMenu() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		jLabel1.setText("Assignment Name");
		jLabel1.setBounds(new Rectangle(25, 31, 118, 18));
		this.getContentPane().setLayout(null);
		tbAssignmentName.setText("jTextField1");
		tbAssignmentName.setBounds(new Rectangle(192, 31, 341, 22));
		jLabel2.setText("Due Date");
		jLabel2.setBounds(new Rectangle(28, 90, 113, 18));
		tbDueDate.setText("tbDueDate");
		tbDueDate.setBounds(new Rectangle(195, 87, 337, 22));
		jLabel3.setText("Suggested Solution");
		jLabel3.setBounds(new Rectangle(28, 151, 118, 18));
		tbSuggestedSolution.setText("jTextField2");
		tbSuggestedSolution.setBounds(new Rectangle(197, 149, 339, 22));
		buttonGrade.setText("Grade");
		buttonGrade.setBounds(new Rectangle(458, 199, 79, 29));
		buttonGrade.addActionListener(this::buttonGrade_actionPerformed);
		buttonReport.setText("Report");
		buttonReport.setBounds(new Rectangle(365, 249, 79, 29));
		buttonReport.addActionListener(this::buttonReport_actionPerformed);
		buttonClose.setText("Close");
		buttonClose.setBounds(new Rectangle(86, 253, 79, 29));
		buttonClose.addActionListener(this::buttonClose_actionPerformed);
		solutionListCombox.setBounds(new Rectangle(32, 204, 413, 22));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(tbAssignmentName, null);
		this.getContentPane().add(jLabel2, null);
		this.getContentPane().add(tbDueDate, null);
		this.getContentPane().add(jLabel3, null);
		this.getContentPane().add(tbSuggestedSolution, null);
		this.getContentPane().add(buttonClose, null);
		this.getContentPane().add(solutionListCombox, null);
		this.getContentPane().add(buttonGrade, null);
		this.getContentPane().add(buttonReport, null);
	}

	public void showMenu(Assignment assignment, Person person) {
		theAssignment = assignment;
		tbAssignmentName.setText(theAssignment.assignmentName);

		DateFormat theDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		tbDueDate.setText(theDateFormat.format(theAssignment.dueDate));
		tbSuggestedSolution.setText(theAssignment.suggestSolution.SolutionFileName);
		refreshSolutionList();
		setVisible(true);
	}

	void buttonClose_actionPerformed(ActionEvent ignoredE) {
		theAssignment.assignmentName = tbAssignmentName.getText();
		DateFormat tempDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		try {
			theAssignment.dueDate = tempDateFormat.parse(tbDueDate.getText());
		} catch (Exception ee) {
			System.out.println("Exception" + ee + "occurred");
		}
		theAssignment.suggestSolution.SolutionFileName = tbSuggestedSolution.getText();
		setVisible(false);
	}

	void buttonGrade_actionPerformed(ActionEvent ignoredE) {
		Solution theSolution = (Solution) solutionListCombox.getSelectedItem();
		if (theSolution == null)
			return;
		SolutionGradingDlg dlg = new SolutionGradingDlg();
		dlg.show(theSolution);
		refreshSolutionList();
	}

	void buttonReport_actionPerformed(ActionEvent ignoredE) {
		SolutionIterator solutionIterator = new SolutionIterator(theAssignment.theSolutionList);
		while (solutionIterator.hasNext()) {
			Solution asolution = (Solution) solutionIterator.next();
			asolution.setReported(true);
		}
		refreshSolutionList();
	}

	@SuppressWarnings("unchecked")
	private void refreshSolutionList() {
		solutionListCombox.removeAllItems();
		SolutionIterator solIter = new SolutionIterator(theAssignment.theSolutionList);
		while (solIter.hasNext()) {
			Solution theSolution = (Solution) solIter.next();
			solutionListCombox.addItem(theSolution);
		}
	}
}
