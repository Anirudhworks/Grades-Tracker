import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> students;

    public GradeTracker() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverage(Student student) {
        ArrayList<Integer> grades = (ArrayList<Integer>) student.getGrades();
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.size() > 0 ? (double) sum / grades.size() : 0.0;
    }

    public int findHighestGrade(Student student) {
        ArrayList<Integer> grades = (ArrayList<Integer>) student.getGrades();
        int highest = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public int findLowestGrade(Student student) {
        ArrayList<Integer> grades = (ArrayList<Integer>) student.getGrades();
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
