package hacsTesting.hacsTesting;

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
 *  @author Satvik Chemudupati
 *  @version 3.0 Formatted code and removed warnings
 */

public class Hacs {

	static Facade theFacade = new Facade();

	public Hacs() {
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		UserInfoItem userinfoitem = new UserInfoItem();
		theFacade.createCourseList();
		while (true) {
			boolean bExit;
			bExit = theFacade.Login(userinfoitem);
			if (bExit)
				break;
			theFacade.createUser(userinfoitem);
			theFacade.attachCourseToUser();
			if (userinfoitem.userType == UserInfoItem.USER_TYPE.Student) // if is a student remind him of the due date
				theFacade.remind();
			boolean bLogout = false;
			while (!bLogout) {
				bLogout = theFacade.selectCourse();
				if (bLogout)
					break;
				bLogout = theFacade.courseOperation();
			}
		}
	}
}
