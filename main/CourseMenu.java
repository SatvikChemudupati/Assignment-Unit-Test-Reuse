package hacsTesting.hacsTesting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serial;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 *
 * @author Satvik Chemudupati
 * @version 3.0 Formatted code and removed warnings
 */

@SuppressWarnings("ALL")
abstract public class CourseMenu extends JDialog {
	@Serial
	private static final long serialVersionUID = 1L;
	Course theCourse;
	boolean bLogout = true;

	JRadioButton assignmentRadio = new JRadioButton();
	JComboBox assignmentCombox = new JComboBox();
	JButton assignmentViewButton = new JButton();
	JButton assignmentAddButton = new JButton();
	JRadioButton optionRadio = new JRadioButton();
	JLabel assignmentContentLable = new JLabel();
	JComboBox optionCombox = new JComboBox();
	JButton optionViewButton = new JButton();
	JButton optionAddButton = new JButton();
	JButton buttonChangeCourse = new JButton();
	JButton buttonLogout = new JButton();

	public CourseMenu() {

		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		setModal(true);
		setSize(503, 294);
	}

	private void jbInit() {
		buttonChangeCourse.setText("ChangeCourse");
		buttonChangeCourse.setBounds(new Rectangle(101, 211, 73, 37));
		buttonChangeCourse.addActionListener(this::buttonChangeCourse_actionPerformed);
		this.getContentPane().setLayout(null);
		this.setTitle("");
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(267, 215, 73, 37));
		buttonLogout.addActionListener(this::buttonLogout_actionPerformed);
		this.getContentPane().add(buttonChangeCourse, null);
		this.getContentPane().add(buttonLogout, null);
	}

	/*
	 * when the add button is pressed, call add assignment function of facade, after
	 * that refresh window
	 */

	/*
	 * when the add button is pressed, call ViewAssignment function of facade, after
	 * that refresh window
	 */


	abstract void showAddButtons();

	abstract void showViewButtons();

	abstract void showRadios();

	abstract void showComboxes();

	void assignmentAddButton_actionPerformed(ActionEvent ignoredE) {
		Hacs.theFacade.addAssignment(theCourse);
		refresh();
	}

	void assignmentViewButton_actionPerformed(ActionEvent ignoredE) {
		Assignment theAss = (Assignment) assignmentCombox.getSelectedItem();
		Hacs.theFacade.viewAssignment(theAss);
	}

	@SuppressWarnings("unchecked")
	void refresh() {
		assignmentCombox.removeAllItems();
		for (Assignment assignment : theCourse.assignmentList) {
			assignmentCombox.addItem(assignment);
		}
	}

	void buttonChangeCourse_actionPerformed(ActionEvent ignoredE) {
		bLogout = false;
		setVisible(false);
	}

	void buttonLogout_actionPerformed(ActionEvent ignoredE) {
		bLogout = true;
		setVisible(false);
	}

	boolean ifLogout() {
		return bLogout;
	}
}
