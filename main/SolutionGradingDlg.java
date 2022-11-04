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

public class SolutionGradingDlg extends JDialog {
	@Serial
	private static final long serialVersionUID = 1L;
	Solution theSolution;
	JLabel jLabel1 = new JLabel();
	JTextField gradeTextField = new JTextField();
	JButton buttonOK = new JButton();
	JLabel labelSolutionFileName = new JLabel();

	public SolutionGradingDlg() {
		try {
			jbInit();
			setSize(316, 186);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		jLabel1.setText("Solution File Name");
		jLabel1.setBounds(new Rectangle(23, 30, 121, 18));
		this.getContentPane().setLayout(null);
		gradeTextField.setBounds(new Rectangle(25, 66, 100, 22));
		buttonOK.setText("OK");
		buttonOK.setBounds(new Rectangle(217, 67, 79, 29));
		buttonOK.addActionListener(this::buttonOK_actionPerformed);
		labelSolutionFileName.setBounds(new Rectangle(212, 34, 163, 18));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(gradeTextField, null);
		this.getContentPane().add(labelSolutionFileName, null);
		this.getContentPane().add(buttonOK, null);
	}

	void show(Solution solution) {
		theSolution = solution;
		gradeTextField.setText("" + theSolution.getGradeInt());
		labelSolutionFileName.setText(theSolution.SolutionFileName);
		setVisible(true);
	}

	void buttonOK_actionPerformed(ActionEvent ignoredE) {
		theSolution.theGrade = Integer.parseInt(gradeTextField.getText());
		setVisible(false);
	}

}
