package hacsTesting.hacsTesting;

import hacsTesting.hacsTesting.UserInfoItem.USER_TYPE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serial;

/**
		* Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
		*
		* @author Zhang ji Zhu Wei
		* @version 1.0
		* @author mjfindler
		* @version 2.0
		*
		*          Update to Java 8
		*
		* @author Satvik Chemudupati
		* @version 3.0 Formatted code and removed warnings
		*/

public class Login extends JDialog {
	@Serial
	private static final long serialVersionUID = 1L;
	boolean menuExit = false;
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JButton loginButton = new JButton();
	JButton buttonExit = new JButton();
	JTextField userNameText = new JTextField();
	JPasswordField passwordText = new JPasswordField();
	JRadioButton studentRadio = new JRadioButton();
	JRadioButton instructorRadio = new JRadioButton();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	private String userBox = null;
	private USER_TYPE userType = USER_TYPE.Student; // default to Student

	public Login() {
		try {
			jbInit();
			setSize(300, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		this.getContentPane().setLayout(null);
		jLabel1.setText("UserName");
		jLabel1.setBounds(new Rectangle(26, 52, 80, 18));
		jLabel2.setText("Password");
		jLabel2.setBounds(new Rectangle(23, 119, 80, 18));
		loginButton.setText("Login");
		loginButton.setBounds(new Rectangle(31, 212, 85, 28));
		loginButton.addActionListener(this::loginButton_actionPerformed);
		buttonExit.setText("Exit");
		buttonExit.setBounds(new Rectangle(180, 211, 97, 28));
		buttonExit.addActionListener(this::buttonExit_actionPerformed);
		userNameText.setBounds(new Rectangle(119, 52, 144, 22));
		passwordText.setBounds(new Rectangle(118, 119, 147, 22));
		studentRadio.setSelected(true);
		studentRadio.setText("Student");
		studentRadio.setBounds(new Rectangle(37, 164, 103, 26));
		instructorRadio.setText("Instructor");
		instructorRadio.setBounds(new Rectangle(177, 162, 103, 26));
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(jLabel2, null);
		this.getContentPane().add(loginButton, null);
		this.getContentPane().add(buttonExit, null);
		this.getContentPane().add(userNameText, null);
		this.getContentPane().add(passwordText, null);
		this.getContentPane().add(studentRadio, null);
		this.getContentPane().add(instructorRadio, null);
		buttonGroup1.add(studentRadio);
		buttonGroup1.add(instructorRadio);
	}

	void loginButton_actionPerformed(ActionEvent ignoredE) {
		BufferedReader file;
		menuExit = false;
		System.out.println("login clicked");
		try {
			if (studentRadio.isSelected())//// student
			{
				userType = USER_TYPE.Student; /// 0 for student
				file = new BufferedReader(new FileReader("StuInfo.txt"));
			} else// instructor
			{
				userType = USER_TYPE.Instructor; // 1 for instructor
				file = new BufferedReader(new FileReader("InsInfor.txt"));
			}
			userBox = userNameText.getText();
			String passwordBox = new String(passwordText.getPassword());
			String loginName = null;
			String aline, userName, password;
			while ((aline = file.readLine()) != null) {
				userName = getUserName(aline);
				password = getPassword(aline);
				if (userName.compareTo(userBox) == 0 && password.compareTo(passwordBox) == 0)
					loginName = userName;
			}
			if (loginName != null) {
				this.setVisible(false);
			}
		} catch (Exception ee) {
			System.out.println("Exception" + ee + "occurred");
		}

	}

	/*
	 * get the user name from aline userName:password
	 */
	private String getUserName(String aline) {
		int separator = aline.lastIndexOf(':');
		return aline.substring(0, separator);
	}

	/*
	 * get the password from aline userName:password
	 */
	private String getPassword(String aline) {
		int separator = aline.lastIndexOf(':');
		return aline.substring(separator + 1);
	}

	/* after login get the userName of the login interface */
	public String getUserName() {
		return userBox;
	}

	/* after login get the userType of the login interface */
	public USER_TYPE getUserType() {
		return userType;
	}

	public boolean isExit() {
		return menuExit;
	}

	void buttonExit_actionPerformed(ActionEvent ignoredE) {
		menuExit = true;
		setVisible(false);
	}
}
