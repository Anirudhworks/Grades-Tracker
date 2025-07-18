import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeTracker gradeTracker = new GradeTracker();
        

        while (true) {
            System.out.println("Menu");
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to enter grades");
            System.out.println("Enter 3 to view stats");
            System.out.println("Enter 4 to exit");
            System.out.println(" ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            if (choice == 1) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();
                gradeTracker.addStudent(new Student(name));
            } else if (choice == 2) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();
                Student student = findStudentByName(gradeTracker.getStudents(), name);
                if (student != null) {
                    System.out.println("Enter grade (enter -1 to stop):");
                    while (true) {
                        int grade = scanner.nextInt();
                        if (grade == -1) break;
                        student.addGrade(grade);
                    }
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();
                Student student = findStudentByName(gradeTracker.getStudents(), name);
                if (student != null) {
                    System.out.println("Average grade: " + gradeTracker.calculateAverage(student));
                    System.out.println("Highest grade: " + gradeTracker.findHighestGrade(student));
                    System.out.println("Lowest grade: " + gradeTracker.findLowestGrade(student));
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }

    private static Student findStudentByName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
