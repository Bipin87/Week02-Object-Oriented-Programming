package EducationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 30, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 50, "Coursera", true, 200, 20);

        // Store the details in array

        Course [] courses = {course, onlineCourse, paidOnlineCourse};
        
        // Display details
        for(Course c : courses){
            c.displayCourseInfo();
            System.out.println();
        }
    }
    
}
