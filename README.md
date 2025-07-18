Student Grade Tracker

Description

The Student Grade Tracker is a Java console application that allows teachers to manage student grades. The program enables teachers to add students, enter grades for each student, and view statistics such as the average, highest, and lowest grades for each student.

Features
Add a new student.
Enter grades for a student.
View statistics (average, highest, and lowest grades) for a student.
How to Run
Prerequisites
Java Development Kit (JDK) installed.
A terminal or command prompt.

Steps to Compile and Run

1.Clone or Download the Repository
	If you haven't already, clone or download the repository to your local machine.

2.Navigate to the Project Directory
	cd path/to/project/directory

3.Compile the Code
	javac Main.java

4.Run the Program
	java Main

Usage
	Main Menu Options

	1.Add a Student
		Prompts for the student's name and adds them to the tracker.
		
	2.Enter Grades
		Prompts for the student's name and allows you to enter multiple grades. Enter -1 to stop entering
 		
	3.grades.
		View Stats Prompts for the student's name and displays their average, highest, and lowest grades.
	
	4.Exit
		Exits the program.

Example Workflow
Menu
Enter 1 to add a student 
Enter 2 to enter grades
Enter 3 to view stats
Enter 4 to exit
Enter Your Choice
1
Enter student name:
Abhinav

Menu
Enter 1 to add a student 
Enter 2 to enter grades
Enter 3 to view stats
Enter 4 to exit
Enter Your Choice
2
Enter student name:
Abhinav
Enter grade (enter -1 to stop):
84 88 85 96 -1

Menu
Enter 1 to add a student 
Enter 2 to enter grades
Enter 3 to view stats
Enter 4 to exit
Enter Your Choice
3
Enter student name:
John Doe
Grades: [84, 88, 85, 96, -1 ]
Sum: 356, Number of grades: 4
Average grade: 88.25
Highest grade: 96
Lowest grade: 84

Menu
Enter 1 to add a student 
Enter 2 to enter grades
Enter 3 to view stats
Enter 4 to exit
Enter Your Choice
4


Troubleshooting


-->Ensure you have the JDK installed and properly set up.
-->Verify that you are compiling and running the correct directory.
-->If you encounter issues, check the console output for debugging statements.

Author

Abhinav Erukulla
