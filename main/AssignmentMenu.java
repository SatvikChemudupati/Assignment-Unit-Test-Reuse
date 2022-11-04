package hacsTesting.hacsTesting;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 *
 * @author Satvik Chemudupati
 * @version 2.0
 */

import javax.swing.*;
import java.io.Serial;


abstract public class AssignmentMenu extends JDialog {
	@Serial
	private static final long serialVersionUID = 1L;

	abstract void showMenu(Assignment assignment, Person person);

	public AssignmentMenu() {
		setModal(true);
		setSize(575, 330);
	}
}
