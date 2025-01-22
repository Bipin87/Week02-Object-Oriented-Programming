import java.util.ArrayList;
import java.util.List;

// Class representing a Student
class Student {
    private String studentName;
    private int studentId;
    private List<Subject> subjects;

    // Constructor
    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
    }

    // Add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Get the list of subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Get student's name
    public String getStudentName() {
        return studentName;
    }

    // Get student's ID
    public int getStudentId() {
        return studentId;
    }
}

// Class representing a Subject
class Subject {
    private String subjectName;
    private int subjectScore;

    // Constructor
    public Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    // Get subject Name
    public String getSubjectName() {
        return subjectName;
    }

    // Get score for the subject
    public int getSubjectScore() {
        return subjectScore;
    }
}

// Class to calculate grades
class GradeCalculator {

    // Method to calculate the total marks of a student
    public int calculateTotalScore(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getSubjectScore();
        }
        return total;
    }

    // Method to calculate the average score
    public double calculateAverageScore(Student student) {
        int total = calculateTotalScore(student);
        int subjectCount = student.getSubjects().size();
        return subjectCount > 0 ? (double) total / subjectCount : 0;
    }

    // Method to determine grade based on average score
    public String calculateGrade(Student student) {
        double average = calculateAverageScore(student);
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

// Main class to demonstrate the application
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Arun", 1);

        // Add subjects and their marks
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 90));
        student.addSubject(new Subject("English", 78));

        // Create a GradeCalculator
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculate and display the results
        System.out.println("Student: " + student.getStudentName());
        System.out.println("Total Marks: " + gradeCalculator.calculateTotalScore(student));
        System.out.println("Average Marks: " + gradeCalculator.calculateAverageScore(student));
        System.out.println("Grade: " + gradeCalculator.calculateGrade(student));
    }
}
