# Assignment-Unit-Test-Reuse

Assignment 4 Testing and Software Reuse
Steps to execute the program:
1. Unzip the zip into the corresponding directory.
2. The unzipped folder mainly contains two folders – main and test
3. The main folder contains all the executable files of the project, and the test folder contains all the test cases for each executable file.
Prerequisites:
1. The information related to the students (login info) is to be placed in the StuInfo.txt present in the root folder for verification.
2. The information related to the instructor (login info) needs to be placed in the InsInfor.txt present in the root folder to verify during the login.
3. The UserCourse.txt contains the information regarding the mapping between the students and their respective courses.
4. The CourseInfo.txt file contains the information about the course mainly, the course names.
5. Any additional information required for the course, student, or instructor, is required to be added to the above-mentioned files.
Instructions to execute the program:
1. The Hacs.java file contains the main function to execute program which will result in a pop-up login page.
2. The login page contains the student login and instructor login buttons to toggle between the student and the instructor login options.
Student Login Procedure:
1. Upon logging into the application using the valid credentials, the application displays the upcoming and overdue assignments of the specific student.
2. Selecting the specified assignment will result in displaying the detailed information regarding the assignment posted by the instructor.
3. The assignments are categorized into high level and low level in terms of difficulty. The assigned difficulty level is given by the instructor to the assignment.
4. Upon selecting the course, it displays all the reported assignments by the instructor and their difficulty rating.
Instructor Login Procedure:
1. The instructor once logged into the system using the valid credentials will have access to the assignments tab where he can have a glance of the specific course and assignments.
2. Upon selecting the specific course from the list of courses he teaches, he can review, edit, and add assignments to the course.
3. He can access the submitted assignments by the students and grade them in the portal.
4. Once edited or added the information regarding the assignment, the instructor can post the assignment into the portal.
Integration between Instructor and Student:
1. The student can submit the assignment due and the submitted assignment will be reflected in the instructor page.
2. The instructor grades the assignment, and that grade gets reflected in the student portal.
